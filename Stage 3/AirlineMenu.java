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
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("         Airline Management Menu");
	        System.out.println("          1. Passenger Menu");
            System.out.println("          2. Staff Menu");
			System.out.println("          3. Admin Menu");
            System.out.println("          4. Quit");
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("Enter your choice: ");
	    
	        int choice = in.nextInt();
            in.nextLine();

            switch (choice)
            {
                case 1:
                    passengerMenu();
                    break;
                case 2:
					if (checkPassword()){
                    staffMenu();
					}
                    break;
				case 3:
					if (checkPassword()){
                     adminMenu();
					}
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
        System.out.println("---------- Admin Menu ----------");
        System.out.println("   1. Load Dummy Passengers");
        System.out.println("   2. Load Dummy Staff");
        System.out.println("   3. Print Passenger Report");
        System.out.println("   4. Print Staff Report");
        System.out.println("   5. Return to Main Menu");
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
            System.out.println("---------- Passenger Menu ----------");
            System.out.println("   1. Add Passenger");
            System.out.println("   2. View Passengers");
			System.out.println("   3. Airline Information");
            System.out.println("   4. Schedule");
			System.out.println("   5. Booking Menu");
			System.out.println("   6. Return to Main Menu");
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
					viewAirlineInfo();
					break;
				case 4:
					displaySchedule();
					break;
				case 5:
                    bookingMenu();
                    break;
                case 6:
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
            System.out.println("---------- Staff Menu ----------");
            System.out.println("   1. Add Staff");
            System.out.println("   2. View Staff");
            System.out.println("   3. View Passenger Tickets");
            System.out.println("   4. Delete Passenger Ticket");
			System.out.println("   5. Airline Information");
            System.out.println("   6. Schedule Menu");
			System.out.println("   7. Airline Menu");
			System.out.println("   8. Return to Main Menu");
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
                    viewTickets();
                    break;
                case 4:
                    deleteTickets();
                    break;
				case 5:
					viewAirlineInfo();
					break;
				case 6:
                    scheduleMenu();
                    break;
				case 7:
                    airlineMenu();
                    break;
                case 8:
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
            System.out.println("---------Airline Management---------");
            System.out.println("   1. Add a flight");
            System.out.println("   2. Add a terminal number");
            System.out.println("   3. Add an airline name");
            System.out.println("   4. Remove a flight number");
            System.out.println("   5. Remove a terminal number");
            System.out.println("   6. Remove an airline name");
			System.out.println("   7. Return to Previous Menu");
			System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();
			
            switch (choice) 
			{
                case 1:
                    addFlightNumber();
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
            System.out.println("---------- Booking Menu ----------");
            System.out.println("   1. Create Ticket");
            System.out.println("   2. View Tickets");
			System.out.println("   3. Return to Previous Menu");
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
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

	public static void scheduleMenu() {
        while (true) {
            System.out.println("---------Schedule Information---------");
            System.out.println("   1. Update departure time");
            System.out.println("   2. Update arrival time");
            System.out.println("   3. Update delayed flight");
            System.out.println("   4. Update cancelled flight");
            System.out.println("   5. Update boarding time");
            System.out.println("   6. Display schedule");
            System.out.println("   7. Return to Previous Menu");
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
    System.out.print("Enter passenger ID: ");
    int id = in.nextInt();
    in.nextLine();

    System.out.print("Enter first name: ");
    String firstName = in.nextLine();

    System.out.print("Enter last name: ");
    String lastName = in.nextLine();

    System.out.print("Enter email: ");
    String email = in.nextLine();

    System.out.print("Enter phone number: ");
    String phoneNumber = in.nextLine();

    Passenger passenger = new Passenger(id, firstName, lastName, email, phoneNumber);
    passengerManager.addPassenger(passenger);

    System.out.println("Passenger added successfully.");
    }
    
    public static void viewPassengers()
    {
		passengerManager.displayAllPassengers();

    }
    
    public static void addStaff()
    {
    System.out.print("Enter staff ID: ");
    int id = in.nextInt();
    in.nextLine();

    System.out.print("Enter first name: ");
    String firstName = in.nextLine();

    System.out.print("Enter last name: ");
    String lastName = in.nextLine();

    System.out.print("Enter role: ");
    String role = in.nextLine();

    System.out.print("Enter salary: $");
    double salary = in.nextDouble();
    in.nextLine();

    Staff staff = new Staff(id, firstName, lastName, role, salary);

    staffManager.addStaff(staff);

    System.out.println("Staff member added successfully.");
    }
    
    public static void viewStaff()
    {
        staffManager.displayAllStaff();
    }
    
    public static void addFlightNumber()
    {  
        System.out.println("Enter FLight Number: ");
        String flightNum = in.nextLine();
        airlineMgmt.addFlightNumber(flightNum);
        System.out.println("Flight number added.");
    }
    
    public static void addTerminalNumber()
    {
	    System.out.println("Enter the Terminal Number:");
		String terminalNumber = in.nextLine();
		airlineMgmt.addTerminalNumber(terminalNumber);
		System.out.println("Terminal number added.");
    }
    
    public static void addAirlineName()
    {
	    System.out.println("Enter the Airline Name:");
		String airlineName = in.nextLine();
		airlineMgmt.addAirlineName(airlineName);
		System.out.println("Airline name added.");
    }
    
    public static void removeFlightNumber()
    {
	    System.out.println("Enter the Flight Number you would like to remove:");
		String terminalNumber = in.nextLine();
		airlineMgmt.removeTerminalNumber(terminalNumber);
		System.out.println("Flight number removed.");
    }
    
    public static void removeTerminalNumber()
    {
	    System.out.println("Enter the Terminal Number you would like to remove:");
		String terminalNumber = in.nextLine();
		airlineMgmt.removeTerminalNumber(terminalNumber);
		System.out.println("Terminal Number Removed.");
    }
    
    public static void removeAirlineName()
    {
	    System.out.println("Enter the Airline Name you would like to remove:");
		String airlineName = in.nextLine();
		airlineMgmt.removeAirlineName(airlineName);
		System.out.println("Airline name removed.");
    }

	public static void viewAirlineInfo() 
    {
        System.out.println("----- Airline Information -----");
   
        System.out.println("Flight Numbers: ");
        for (String f : airlineMgmt.getFlightNumber()) 
        {
            System.out.println("- " + f);
        }
   
        System.out.println("\nTerminal Numbers: ");
        for (String t : airlineMgmt.getTerminalNumber()) 
        {
            System.out.println("- " + t);
        }
   
        System.out.println("\nAirline Name: ");
        for (String a : airlineMgmt.getAirlineName()) 
        {
            System.out.println("- " + a);
        }
    }
    
    public static void createTicket()
    {
        System.out.println("Enter Ticket Number: ");
        int ticketNum = in.nextInt();
        
        System.out.println("The price is $100.");
        float price = 100;
        in.nextLine();
    
        System.out.println("Enter flight class: ");
        String fClass = in.nextLine();
    
        System.out.println("Enter Flight Date YYYY-MM-DD (Enter date exactly as formatted): ");        
        LocalDate date = LocalDate.parse(in.nextLine());
        
        System.out.println("Current Destinations (Honolulu HI, Fairbanks AK) ");
        System.out.println("Enter Flight Destination: ");
        String dest = in.nextLine();
    
        System.out.println("Portales NM is your starting location.");
        String start = "Portales NM";
        
        Flight f = new Flight(dest, start, (short)3000, (short)800);
    
        Ticket t = new Ticket(ticketNum, price, fClass, date, f);
        ticketMgmt.addTicket(t);
    
        System.out.println("Ticket Created.");
    }
    
    public static void viewTickets()
    {
        System.out.println("List of Tickets");
        for (Ticket t : ticketMgmt.getTickets())
        {
            System.out.println("Ticket #" + t.getTicketNumber());
            System.out.println("Price: " + t.getPrice());
            System.out.println("Class: " + t.getFlightClass());
            System.out.println("Date: " + t.getFlightDate());
        }
    }
    
    public static void deleteTickets()
    {
        System.out.println("Enter ticket number to delete: ");
        int num = in.nextInt();
        in.nextLine();
    
        boolean removed = ticketMgmt.removeTicket(num);
        if (removed)
        {
            System.out.println("Ticket removed.");
        }
        else
        {
            System.out.println("Ticket not found.");
        }
    }
    
    public static void updateDepartureTime()
    {
	    System.out.println("Enter the departure time you would like to add:");
		short departureTime = in.nextShort();
		scheduleMgmt.updateDepartureTime(departureTime);
		System.out.println("Departure time updated.");
    }
    
    public static void updateArrivalTime()
    {
	    System.out.println("Enter the arrival time you would like to add:");
		short arrivalTime = in.nextShort();
		scheduleMgmt.updateArrivalTime(arrivalTime);
		System.out.println("Arrival time updated.");
    }
    
    public static void updateDelayedFlight()
    {
	    System.out.println("Enter the delayed flight:");
		short delayedFlight = in.nextShort();
		scheduleMgmt.updateDelayedFlight(delayedFlight);
		System.out.println("Delayed flights updated.");
    }
    
    public static void updateCancelledFlight()
    {
	    System.out.println("Enter the cancelled flight:");
		short cancelledFlight = in.nextShort();
		scheduleMgmt.updateCancelledFlight(cancelledFlight);
		System.out.println("Cancelled flights updated.");
    }

    public static void updateBoardingTime()
    {
	    System.out.println("Enter the boarding time:");
		short boardingTime = in.nextShort();
		scheduleMgmt.updateBoardingTime(boardingTime);
		System.out.println("Boarding time updated.");
    }
    
    public static void displaySchedule()
    {
		System.out.println(scheduleMgmt.getDepartureTime());
		System.out.println(scheduleMgmt.getArrivalTime());
		System.out.println(scheduleMgmt.getDelayedFlight());
		System.out.println(scheduleMgmt.getCancelledFlight());
		System.out.println(scheduleMgmt.getBoardingTime());
    }     	
	
	public static boolean checkPassword()
   {
	   while (true)
      {
        System.out.print("Enter password (or type 'back' to cancel): ");
        String password = in.nextLine().trim();

        if (password.equalsIgnoreCase("back"))
        {
            return false;
        }

        if (password.equalsIgnoreCase("eduardo"))
        {
            System.out.println("Access granted.");
            return true;
        }

        System.out.println();
        System.out.println("Incorrect password. Try again.");
      }
   }
}
