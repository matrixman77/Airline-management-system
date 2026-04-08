import java.time.LocalDate;
import java.util.ArrayList;

public class TicketManagement
{
    private ArrayList<Ticket> tickets;
    
    public TicketManagement()
    {
        tickets = new ArrayList<>();
    }
    
    public void addTicket(Ticket ticket)
    {
        tickets.add(ticket);
    }
    
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
    
    public void updatePrice(int ticketNumber, float newPrice)
    {
        for (Ticket t : tickets)
        {
            if (t.getTicketNumber() == ticketNumber)
            {
                t.setPrice(newPrice);
                return;
            }
        }
    }
    
    public void changeFlightClass(int ticketNumber, String newClass)
    {
        for (Ticket t : tickets)
        {
            if (t.getTicketNumber() == ticketNumber)
            {
                t.setFlightClass(newClass);
                return;
            }
        }
    }
    
    public void updateFlightDate(int ticketNumber, LocalDate newDate)
    {
        for (Ticket t : tickets)
        {
            if (t.getTicketNumber() == ticketNumber)
            {
                t.setFlightDate(newDate);
                return;
            }
        }
    }
}
