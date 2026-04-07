/**
 * Caleb Bafukila
 * CSCI 2210
 * Project Stage: 3
 * Passenger class for the Airline Management System.
 */
public class Passenger
{
    private int passengerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor
     */
    public Passenger()
    {
        passengerId = 0;
        firstName = "";
        lastName = "";
        email = "";
        phoneNumber = "";
    }

    /**
     * Constructor with parameters
     * @param passengerId passenger id
     * @param firstName first name
     * @param lastName last name
     * @param email email
     * @param phoneNumber phone number
     */
    public Passenger(int passengerId, String firstName, String lastName,
                     String email, String phoneNumber)
    {
        this.passengerId = passengerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getPassengerId()
    {
        return passengerId;
    }

    public void setPassengerId(int passengerId)
    {
        this.passengerId = passengerId;
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns passenger information as a string
     * @return passenger details
     */
    public String toString()
    {
        return "Passenger ID: " + passengerId
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nEmail: " + email
                + "\nPhone Number: " + phoneNumber;
    }
}


