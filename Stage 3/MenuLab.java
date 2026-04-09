/** 
* Tyler Barber,02/12/2026, Lab3
*
* This is a package that imports and allows the use of the Scanner object.
*/
import java.util.Scanner;

public class AirlineMenu
{
    static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		Menu();
	}
	/**
    * This method creates the intial menu with 3 options.
    */
	public static void Menu()
	{
	    while (true)
	    {
			System.out.println("Welcome to Eduwardo Airlines Management System");
	        System.out.println("~~~~~~~~~~~~");
		    System.out.println("Airline Management Menu");
	        System.out.println("1. Passenger Menu");
            System.out.println("2. Staff Menu");
            System.out.println("3. Booking Menu");
            System.out.println("4. Ticket Menu");
            System.out.println("5. Quit");
	        System.out.println("~~~~~~~~~~~~");
	        System.out.println("Enter your choice: ");
	    
	        int choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    passengerMenu();
                    break;
                case 2:
                    staffMenu();
                    break;
                case 3:
                    bookingMenu();
                    break;
                case 4:
                    ticketMenu();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void passengerMenu()
    {
        while (true)
        {
            System.out.println("----- Passenger Menu -----");
            System.out.println("1. Add Passenger");
            System.out.println("2. View Passengers");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    addPassenger();
                    break;
                case 2:
                    viewPassengers();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void staffMenu()
    {
        while (true)
        {
            System.out.println("----- Staff Menu -----");
            System.out.println("1. Add Staff");
            System.out.println("2. View Staff");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    addStaff();
                    break;
                case 2:
                    viewStaff();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
	/**
    * This method creates a menu to present the options for the Recursive Methods.
    */
	public static void MenuRecursive()
	{
	    while (true)
	    {
	        System.out.println("Recursive Methods Menu:");
	        System.out.println("1. Search character");
	        System.out.println("2. Return Main");
	        System.out.println("Enter your choice: ");
	    
	        int input = in.nextInt();
	        in.nextLine();
	    
	        switch (input)
	        {   
	            case 1:
	                rec_option1();
	                break;
	            case 2:
	                System.out.println("Returning to the main menu. ");
	                return;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	}
	/**
    * This method gets input for a string and calls the method countA.
    * This method also prints out how many a's were in the string.
    */
	public static void reg_option1()
	{
	    System.out.println("Write a string: ");
	    String s = in.nextLine().toLowerCase();
	    
	    int count = countA(s);
	    System.out.println("There are: " + count + " a's");
	    
	}
	/**
    * This method takes a string and returns how many a's are in the string.
    * @param s, String
    * @return the count
    */
	public static int countA(String s)
	{
	    int count = 0;
	    for (int aNum = 0; aNum < s.length(); aNum++)
	    {
	        if (s.charAt(aNum) == 'a')
	        {
	            count++;
	        }
	    }
	    return count;
	}
	/**
    * This method takes a string, a target character, a new character and prints out the new string.
    */
	public static void reg_option2()
	{
	    System.out.println("Write a string: ");
	    String s = in.nextLine();
	    
	    System.out.println("Write the target character: ");
	    char a = in.nextLine().charAt(0);
	    
	    System.out.println("Write the new character: ");
	    char b = in.nextLine().charAt(0);
	    
	    String newStr = replace(s, a, b);
	    System.out.println(newStr);
	}
	/**
    * This method takes as parameters a string and two characters and returns a string with each first character replaced by the second.
    * @param s, String
    * @param a, first character
    * @param b, second character
    * @returns the new string
    */
	public static String replace(String s, char a, char b)
	{
	    String replacementStr = "";
	    for (int letNum = 0; letNum < s.length(); letNum++)
	    {
	        char letter = s.charAt(letNum);
	        if (letter == a)
	        {
	            replacementStr += b;
	        }
	        else
	        {
	            replacementStr += letter;
	        }
	    }
	    return replacementStr;
	}
	/**
    * This method gets a string and a target character, then it calls the method containsCharacter, and it prints out the result t/f.
    */
	public static void rec_option1()
	{
	    System.out.println("Write a string: ");
	    String s = in.nextLine();
	    
	    System.out.println("Write the target character: ");
	    char target = in.nextLine().charAt(0);
	    
	    boolean found = containsCharacter(s, target);
	    System.out.println(found);
	}
	/**
    * This method returns true or false if the target character exists.
    * @param str, String
    * @param target, character
    * @returns boolean/true or false
    */
	public static boolean containsCharacter(String str, char target)
	{
	    if (str.length() == 0)
	    {
	        return false;
	    }
	    
	    if (str.charAt(0) == target)
	    {
	        return true;
	    }
	    
	    return containsCharacter(str.substring(1), target);
	}
}
