/** 
* Tyler Barber,02/12/2026, Lab3
*
* This is a package that imports and allows the use of the Scanner object.
*/
import java.util.Scanner;

public class MenuLab
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
	        System.out.println("~~~~~~~~~~~~");
	        System.out.println("Main Menu:");
	        System.out.println("1. Regular Methods");
	        System.out.println("2. Recursive Methods");
	        System.out.println("3. Quit");
	        System.out.println("~~~~~~~~~~~~");
	        System.out.println("Enter your choice: ");
	    
	        int input = in.nextInt();
	        in.nextLine();
	    
	        switch (input)
	        {   
	            case 1:
	                MenuRegular();
	                break;
	            case 2:
	                MenuRecursive();
	                break;
	            case 3:
	                System.out.println("Exiting the Program. Goodbye!");
	                System.exit(0);
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	}
	/**
    * This method creates a menu to present the options for the Regular Methods.
    */
	public static void MenuRegular()
	{
	    while (true)
	    {
	        System.out.println("Regular Methods Menu:");
	        System.out.println("1. Count number of As");
	        System.out.println("2. Replace target character");
	        System.out.println("3. Return Main");
	        System.out.println("Enter your choice: ");
	    
	        int input = in.nextInt();
	        in.nextLine();
	    
	        switch (input)
	        {   
	            case 1:
	                reg_option1();
	                break;
	            case 2:
	                reg_option2();
	                break;
	            case 3:
	                System.out.println("Returning to the main menu. ");
	                return;
	            default:
	                System.out.println("Invalid choice. Please try again. ");
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
