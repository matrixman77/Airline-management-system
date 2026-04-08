import java.util.ArrayList;

/**
 * Caleb Bafukila
 * CSCI 2210
 * Project Stage: 3
 * StaffManager class for managing staff members.
 */
public class StaffManager
{
    private ArrayList<Staff> staffList;

    /**
     * Default constructor
     */
    public StaffManager()
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
            return true;
        }

        return false;
    }

    /**
     * Creates dummy staff data
     */
    public void loadDummyStaff()
    {
        addStaff(new Staff(201, "Sarah", "Johnson", "Pilot", 85000));
        addStaff(new Staff(202, "Michael", "Lee", "Flight Attendant", 45000));
        addStaff(new Staff(203, "Emma", "Davis", "Manager", 65000));
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
