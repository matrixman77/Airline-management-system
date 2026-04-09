/** 
* Tyler Barber
*/
import java.time.LocalDate;
import java.util.ArrayList;

public class TicketManagement
{
    private ArrayList<Ticket> tickets;
/** 
* This constructor initializes the list of tickets
*/
    public TicketManagement()
    {
        this.tickets = new ArrayList<>();
    }
/** 
* This method adds a ticket to the list
* @param ticket, the ticket
*/
    public void addTicket(Ticket ticket)
    {
        tickets.add(ticket);
    }
/** 
* This method removes a ticket from the array
* @param ticketNumber, the ticket number 
*/
    public boolean removeTicket(int ticketNumber)
    {
        for (int i = 0; i < tickets.size(); i++)
        {
            if (tickets.get(i).getTicketNumber() == ticketNumber)
            {
                tickets.remove(i);
                return true;
            }
        }
        return false;
    }
/** 
* This method updates the price of the ticket 
* @param newPrice, the new price of the ticket
*/
    public void updatePrice(float newPrice)
    {
        for (Ticket t : tickets)
        {
            t.setPrice(newPrice);
        }
    }
/** 
* This method changes the class of the flight
* @param newClass, the new class of the flight
*/
    public void changeFlightClass(String newClass)
    {
        for (Ticket t : tickets)
        {
            t.setFlightClass(newClass);
        }
    }
/** 
* This method updates the date of the flight
* @param newDate, the new date of the flight
*/
    public void updateFlightDate(LocalDate newDate)
    {
        for (Ticket t : tickets)
        {
            t.setFlightDate(newDate);
        }
    }
}
