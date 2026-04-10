import java.util.Scanner;

public class AirlineMenu
{
    static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		Menu();
	}
	
	public static void Menu()
	{
	    while (true)
	    {
			System.out.println("Welcome to Eduwardo Airlines Management System");
	        System.out.println("~~~~~~~~~~~~");
		    System.out.println("Airline Management Menu");
	        System.out.println("1. Passenger Menu");
            System.out.println("2. Staff Menu");
            System.out.println("3. Quit");
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
            System.out.println("3. Booking");
			System.out.println("4. Return to Main Menu");
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
                    bookingMenu();
                    break;
                case 4:
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
            System.out.println("3. Schedule");
			System.out.println("4. Return to Main Menu");
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
                    scheduleMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
	
    public static void AirlineMenu() {
        while (true) {
            System.out.println("----Airline Management----");
            System.out.println("1. Add a flight");
            System.out.println("2. Add a terminal number");
            System.out.println("3. Add an airline name");
            System.out.println("4. Remove a flight number");
            System.out.println("5. Remove a terminal number");
            System.out.println("6. Remove an airline name");
			System.out.println("7. Return to the Main Menu");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addFlight();
                    break;
                case 2:
                    addTerminalNumber();
                    break;
                case 3:
                    addAirlineName();
                    break;
                case 4:
                    removeFlightNumber();
                    break;
                case 5:
                    removeTerminalNumber();
                    break;
                case 6:
                    removeAirlineName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
