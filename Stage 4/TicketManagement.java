/** 
* Tyler Barber
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class TicketManagement
{
    private ArrayList<Ticket> tickets;
    private int nextTicketNumber = 1;
    
    private ScheduleManagement scheduleMgmt;
    private PassengerManagment passengerManager;
/** 
* This constructor initializes the list of tickets
*/
    public TicketManagement(ScheduleManagement scheduleMgmt, PassengerManagment passengerManager)
    {
        this.tickets = new ArrayList<>();
        this.scheduleMgmt = scheduleMgmt;
        this.passengerManager = passengerManager;
    }
/** 
* This method adds a ticket to the list
* @param ticket, the ticket
*/
    public void addTicket(Ticket ticket)
    {
        tickets.add(ticket);
    }
/** 
* This method returns the tickets
*/
    public ArrayList<Ticket> getTickets()
    {
        return tickets;
    }
/** 
* This method removes a ticket from the array
* @param ticketNumber, the ticket number 
*/
    public boolean removeTicket(int ticketNumber)
    {
        for (int i = 0; i < tickets.size(); i++)
        {
            if (tickets.get(i).getTicketNumber() == ticketNumber)
            {
                tickets.remove(i);
                return true;
            }
        }
        return false;
    }
/** 
* This method updates the price of the ticket 
* @param newPrice, the new price of the ticket
*/
    public void updatePrice(float newPrice)
    {
        for (Ticket t : tickets)
        {
            t.setPrice(newPrice);
        }
    }
/** 
* This method changes the class of the flight
* @param newClass, the new class of the flight
*/
    public void changeFlightClass(String newClass)
    {
        for (Ticket t : tickets)
        {
            t.setFlightClass(newClass);
        }
    }
/** 
* This method updates the date of the flight
* @param newDate, the new date of the flight
*/
    public void updateFlightDate(LocalDate newDate)
    {
        for (Ticket t : tickets)
        {
            t.setFlightDate(newDate);
        }
    }
    
    public int generateTicketNumber()
    {
        return nextTicketNumber++;
    }
    
    public void saveTicketsToFile() 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("tickets.txt", true))) 
        {
            for (Ticket t : tickets) 
            {
                writer.println
                (
                    t.getTicketNumber() + "," +
                    t.getPassenger().getPassengerId() + "," +
                    t.getPassenger().getFirstName() + " " + t.getPassenger().getLastName() + "," +
                    t.getFlightClass() + "," +
                    t.getFlightDate() + "," +
                    t.getFlight().getDestination() + "," +
                    t.getPrice() + "," +
                    "Eduardo Airlines"
                );
            }

        } catch (IOException e) 
        {
        }
    }
    
    public void loadTicketsFromFile() 
    {
        File file = new File("tickets.txt");
        if (!file.exists()) return;
        
        tickets.clear();
        int maxTicketNum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");

                int ticketNum = Integer.parseInt(parts[0]);
                int passengerId = Integer.parseInt(parts[1]);
                String passengerName = parts[2];
                String flightClass = parts[3];
                LocalDate date = LocalDate.parse(parts[4]);
                String destination = parts[5];
                float price = Float.parseFloat(parts[6]);

                Passenger p = passengerManager.searchPassengerById(passengerId);

                Flight f = new Flight(destination, "Portales NM", (short)3000, (short)800);

                Ticket t = new Ticket(
                    ticketNum, price, flightClass, date, f, p,
                    scheduleMgmt.getDepartureTime(),
                    scheduleMgmt.getArrivalTime(),
                    scheduleMgmt.getBoardingTime()
                );

                tickets.add(t);
                if (ticketNum > maxTicketNum) 
                {
                maxTicketNum = ticketNum;
                }
            }
        } catch (Exception e) 
        {
        }
        nextTicketNumber = maxTicketNum + 1;
    }
}
