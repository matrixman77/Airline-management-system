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
 * StaffManager class for managing staff members.
 */
public class StaffManagment
{
    private ArrayList<Staff> staffList;
    private String fileName = "staff.txt";

    /**
     * Default constructor
     */
    public StaffManagment()
    {
        staffList = new ArrayList<Staff>();
    }

    /**
     * Adds a staff member
     * @param staff staff object
     */
    public void addStaff(Staff staff)
    {
        staffList.add(staff);
        saveStaffToFile();
    }

    /**
     * Displays all staff members
     */
    public void displayAllStaff()
    {
        if (staffList.size() == 0)
        {
            System.out.println("No staff members found.");
        }
        else
        {
            for (int i = 0; i < staffList.size(); i++)
            {
                System.out.println(staffList.get(i));
                System.out.println("-------------------------");
            }
        }
    }

    /**
     * Searches for a staff member by ID
     * @param staffId staff id
     * @return Staff object if found, null otherwise
     */
    public Staff searchStaffById(int staffId)
    {
        for (int i = 0; i < staffList.size(); i++)
        {
            if (staffList.get(i).getStaffId() == staffId)
            {
                return staffList.get(i);
            }
        }
        return null;
    }

    /**
     * Updates staff information
     * @param staffId staff id
     * @param firstName new first name
     * @param lastName new last name
     * @param role new role
     * @param salary new salary
     * @return true if updated, false if not found
     */
    public boolean updateStaff(int staffId, String firstName,
                               String lastName, String role, double salary)
    {
        Staff staff = searchStaffById(staffId);

        if (staff != null)
        {
            staff.setFirstName(firstName);
            staff.setLastName(lastName);
            staff.setRole(role);
            staff.setSalary(salary);
            saveStaffToFile();
            return true;
        }

        return false;
    }

    /**
     * Deletes a staff member by ID
     * @param staffId staff id
     * @return true if deleted, false if not found
     */
    public boolean deleteStaff(int staffId)
    {
        Staff staff = searchStaffById(staffId);

        if (staff != null)
        {
            staffList.remove(staff);
            saveStaffToFile();
            return true;
        }

        return false;
    }

    public void loadStaffFromFile()
{
    staffList.clear();

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
                String role = parts[3].trim();
                double salary = Double.parseDouble(parts[4].trim());

                Staff staff = new Staff(id, firstName, lastName, role, salary);
                staffList.add(staff);
            }
        }

        inputFile.close();
    }
    catch (FileNotFoundException e)
    {
        System.out.println("Staff file not found.");
    }
}

public void saveStaffToFile()
{
    try
    {
        PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));

        for (int i = 0; i < staffList.size(); i++)
        {
            Staff s = staffList.get(i);
            outputFile.println(
                s.getStaffId() + "," +
                s.getFirstName() + "," +
                s.getLastName() + "," +
                s.getRole() + "," +
                s.getSalary()
            );
        }

        outputFile.close();
    }
    catch (Exception e)
    {
        System.out.println("Error saving staff.");
    }
}

public String getAllStaffText()
{
    if (staffList.size() == 0)
    {
        return "No staff members found.";
    }

    String text = "";

    for (int i = 0; i < staffList.size(); i++)
    {
        text += staffList.get(i).toString() + "\n-------------------------\n";
    }

    return text;
}

public int getStaffCount()
{
    return staffList.size();
}

    /**
     * Creates dummy staff data
     */
    public void loadDummyStaff()
    {
        addStaff(new Staff(201, "Caleb", "Johnson", "Pilot", 85000));
        addStaff(new Staff(202, "Tyler", "Lee", "Flight Attendant", 45000));
        addStaff(new Staff(203, "Johnathan", "Davis", "Manager", 65000));
    }

    /**
     * Prints a simple staff report
     */
    public void printStaffReport()
    {
        System.out.println("STAFF REPORT");
        System.out.println("Total Staff Members: " + staffList.size());
    }
}
