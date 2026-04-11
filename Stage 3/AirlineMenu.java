import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class AirlineMenu
{
    static Scanner in = new Scanner(System.in);

	static PassengerManagment passengerManager = new PassengerManagment();
	static StaffManagment staffManager = new StaffManagment();
	static FlightManagement flightMgmt = new FlightManagement();
    static TicketManagement ticketMgmt = new TicketManagement();
	static AirlineManagement airlineMgmt = new AirlineManagement();
	static ScheduleManagement scheduleMgmt = new ScheduleManagement();
    static BookingManagement bookingMgmt;
    
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
			System.out.println("3. Admin Menu");
            System.out.println("4. Quit");
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
                     adminMenu();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
	
public static void adminMenu()
{
    while (true)
    {
        System.out.println("----- Admin Menu -----");
        System.out.println("1. Load Dummy Passengers");
        System.out.println("2. Load Dummy Staff");
        System.out.println("3. Print Passenger Report");
        System.out.println("4. Print Staff Report");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = in.nextInt();
        in.nextLine();

        switch (choice)
        {
            case 1:
                passengerManager.loadDummyPassengers();
                System.out.println("Dummy passengers loaded.");
                break;
            case 2:
                staffManager.loadDummyStaff();
                System.out.println("Dummy staff loaded.");
                break;
            case 3:
                passengerManager.printPassengerReport();
                break;
            case 4:
                staffManager.printStaffReport();
                break;
            case 5:
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
            System.out.println("3. Booking Menu");
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
            System.out.println("3. Schedule Menu");
			System.out.println("4. Airline Menu");
			System.out.println("5. Return to Main Menu");
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
                    airlineMenu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
	
    public static void airlineMenu() 
	{
        while (true) 
		{
            System.out.println("----Airline Management----");
            System.out.println("1. Add a flight");
            System.out.println("2. Add a terminal number");
            System.out.println("3. Add an airline name");
            System.out.println("4. Remove a flight number");
            System.out.println("5. Remove a terminal number");
            System.out.println("6. Remove an airline name");
			System.out.println("7. Return to Previous Menu");
			System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();
			
            switch (choice) 
			{
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

	 public static void bookingMenu()
    {
        while (true)
        {
            System.out.println("----- Booking Menu -----");
            System.out.println("1. Create Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Delete Ticket");
			System.out.println("4. Return to Previous Menu");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    createTicket();
                    break;
                case 2:
                    viewTickets();
                    break;
				case 3:
                    deleteTickets();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

	public static void scheduleMenu() {
        while (true) {
            System.out.println("----Schedule Information----");
            System.out.println("1. Update departure time");
            System.out.println("2. Update arrival time");
            System.out.println("3. Update delayed flight");
            System.out.println("4. Update cancelled flight");
            System.out.println("5. Update boarding time");
            System.out.println("6. Display schedule");
            System.out.println("7. Return to Previous Menu");
			System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine(); 

			switch (choice)
			{
                case 1:
                    updateDepartureTime();
                    break;
                case 2:
                    updateArrivalTime();
                    break;
                case 3:
                    updateDelayedFlight();
                    break;
                case 4:
                    updateCancelledFlight();
                    break;
                case 5:
                    updateBoardingTime();
                    break;
                case 6:
                    displaySchedule();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

	public static void addPassenger()
    {
    
    }
    
    public static void viewPassengers()
    {
    
    }
    
    public static void addStaff()
    {
    
    }
    
    public static void viewStaff()
    {
    
    }
    
    public static void addFlight()
    {
    
    }
    
    public static void addTerminalNumber()
    {
    
    }
    
    public static void addAirlineName()
    {
    
    }
    
    public static void removeFlightNumber()
    {
    
    }
    
    public static void removeTerminalNumber()
    {
    
    }
    
    public static void removeAirlineName()
    {
    
    }
    
    public static void createTicket()
    {
    
    }
    
    public static void viewTickets()
    {
    
    }
    
    public static void deleteTickets()
    {
    
    }
    
    public static void updateDepartureTime()
    {
    
    }
    
    public static void updateArrivalTime()
    {
    
    }
    
    public static void updateDelayedFlight()
    {
    
    }
    
    public static void updateCancelledFlight()
    {
    
    }

    public static void updateBoardingTime()
    {
    
    }
    
    public static void displaySchedule()
    {
    
    }

}
