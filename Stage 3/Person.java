
public class Person
{
    protected int id;
    protected String firstName;
    protected String lastName;

    /**
     * Default constructor
     */
    public Person()
    {
        id = 0;
        firstName = "";
        lastName = "";
    }

    /**
     * Constructor with parameters
     * @param id person id
     * @param firstName first name
     * @param lastName last name
     */
    public Person(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    /**
     * Returns full name
     * @return full name
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Returns person info
     */
    public String toString()
    {
        return "ID: " + id
                + "\nName: " + getFullName();
                
    }
}


