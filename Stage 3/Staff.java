/**
 * Caleb Bafukila
 * CSCI 2210
 * Project Stage: 3
 * Staff class for the Airline Management System.
 */
public class Staff
{
    private int staffId;
    private String firstName;
    private String lastName;
    private String role;
    private double salary;

    /**
     * Default constructor
     */
    public Staff()
    {
        staffId = 0;
        firstName = "";
        lastName = "";
        role = "";
        salary = 0.0;
    }

    /**
     * Constructor with parameters
     * @param staffId staff id
     * @param firstName first name
     * @param lastName last name
     * @param role job role
     * @param salary salary
     */
    public Staff(int staffId, String firstName, String lastName,
                 String role, double salary)
    {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.salary = salary;
    }

    public int getStaffId()
    {
        return staffId;
    }

    public void setStaffId(int staffId)
    {
        this.staffId = staffId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * Returns staff information as a string
     * @return staff details
     */
    public String toString()
    {
        return "Staff ID: " + staffId
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nRole: " + role
                + "\nSalary: $" + salary;
    }
    
    
    
}