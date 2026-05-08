public class Main 
{
    static AirlineManagement airlineMgmt = new AirlineManagement();
    static StaffManagment staffManager = new StaffManagment();
    static ScheduleManagement scheduleMgmt = new ScheduleManagement();
    static PassengerManagment passengerManager = new PassengerManagment();
    static TicketManagement ticketMgmt = new TicketManagement(scheduleMgmt, passengerManager);
    
    public static void main(String[] args) 
    {       
        ticketMgmt.loadTicketsFromFile();
        java.awt.EventQueue.invokeLater(() -> new MainMenu(ticketMgmt, passengerManager, scheduleMgmt, airlineMgmt, staffManager).setVisible(true));
    }
}
