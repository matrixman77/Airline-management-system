import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Caleb Bafukila
 * CSCI 2210
 * Project Stage: 3
 * PassengerManager class for managing passengers.
 */
public class PassengerManagment
{
    private ArrayList<Passenger> passengerList;
    private String fileName = "passengers.txt";

    /**
     * Default constructor
     */
    public PassengerManagment()
    {
        passengerList = new ArrayList<Passenger>();
    }

    /**
     * Adds a passenger to the list
     * @param passenger passenger object
     */
    public void addPassenger(Passenger passenger)
    {
        passengerList.add(passenger);
        savePassengersToFile();
    }

public void loadPassengersFromFile()
{
    passengerList.clear();

    try
    {
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNextLine())
        {
            String line = inputFile.nextLine();
            String[] parts = line.split(",");

            if (parts.length == 5)
            {
                int id = Integer.parseInt(parts[0].trim());
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                String email = parts[3].trim();
                String phoneNumber = parts[4].trim();

                Passenger passenger = new Passenger(id, firstName, lastName, email, phoneNumber);
                passengerList.add(passenger);
            }
        }

        inputFile.close();
    }
    catch (FileNotFoundException e)
    {
        System.out.println("Passenger file not found.");
    }
}

public void savePassengersToFile()
{
    try
    {
        PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));

        for (int i = 0; i < passengerList.size(); i++)
        {
            Passenger p = passengerList.get(i);
            outputFile.println(
                p.getPassengerId() + "," +
                p.getFirstName() + "," +
                p.getLastName() + "," +
                p.getEmail() + "," +
                p.getPhoneNumber()
            );
        }

        outputFile.close();
    }
    catch (Exception e)
    {
        System.out.println("Error saving passengers.");
    }
}

public String getAllPassengersText()
{
    if (passengerList.size() == 0)
    {
        return "No passengers found.";
    }

    String text = "";

    for (int i = 0; i < passengerList.size(); i++)
    {
        text += passengerList.get(i).toString() + "\n-------------------------\n";
    }

    return text;
}

public int getPassengerCount()
{
    return passengerList.size();
}


    
    /**
     * Displays all passengers
     */
    public void displayAllPassengers()
    {
        if (passengerList.size() == 0)
        {
            System.out.println("No passengers found.");
        }
        else
        {
            for (int i = 0; i < passengerList.size(); i++)
            {
                System.out.println(passengerList.get(i));
                System.out.println("-------------------------");
            }
        }
    }

    /**
     * Searches for a passenger by ID
     * @param passengerId passenger id
     * @return Passenger object if found, null otherwise
     */
    public Passenger searchPassengerById(int passengerId)
    {
        for (int i = 0; i < passengerList.size(); i++)
        {
            if (passengerList.get(i).getPassengerId() == passengerId)
            {
                return passengerList.get(i);
            }
        }
        return null;
    }

    /**
     * Updates passenger information
     * @param passengerId passenger id
     * @param firstName new first name
     * @param lastName new last name
     * @param email new email
     * @param phoneNumber new phone number
     * @return true if updated, false if not found
     */
    public boolean updatePassenger(int passengerId, String firstName,
                                   String lastName, String email, String phoneNumber)
    {
        Passenger passenger = searchPassengerById(passengerId);

        if (passenger != null)
        {
            passenger.setFirstName(firstName);
            passenger.setLastName(lastName);
            passenger.setEmail(email);
            passenger.setPhoneNumber(phoneNumber);
            savePassengersToFile();
            return true;
        }

        return false;
    }

    /**
     * Deletes a passenger by ID
     * @param passengerId passenger id
     * @return true if deleted, false if not found
     */
    public boolean deletePassenger(int passengerId)
    {
        Passenger passenger = searchPassengerById(passengerId);

        if (passenger != null)
        {
            passengerList.remove(passenger);
            savePassengersToFile();
            return true;
        }

        return false;
    }

    /**
     * Creates dummy passenger data
     */
    public void loadDummyPassengers()
    {
        addPassenger(new Passenger(101, "John", "Smith", "john@email.com", "555-1111"));
        addPassenger(new Passenger(102, "Maria", "Lopez", "maria@email.com", "555-2222"));
        addPassenger(new Passenger(103, "David", "Brown", "david@email.com", "555-3333"));
    }

    /**
     * Prints a simple passenger report
     */
    public void printPassengerReport()
    {
        System.out.println("PASSENGER REPORT");
        System.out.println("Total Passengers: " + passengerList.size());
    }
}
