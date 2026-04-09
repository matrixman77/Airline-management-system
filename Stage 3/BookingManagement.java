/** 
* Tyler Barber
*/
public class BookingManagement
{
    private Booking booking;
/** 
* This constructor creats an instance of a booking
* @param totalSeats, the total seats of the Flight
* @param flight, the flight
*/
    public BookingManagement(short totalSeats, Flight flight)
    {
        this.booking = new Booking(totalSeats, flight);
    }
/** 
* This method assignes the seat to the ticket
* @param ticket, the ticket
*/
    public void assignSeatToTicket(Ticket ticket)
    {
        String seat = booking.assignSeat();
        
        if (seat != null)
        {
            ticket.assignSeat(seat);
            System.out.println("Assigned " + seat + " to ticket " + ticket.getTicketNumber());
        }
        else
        {
            System.out.println("No seats available");
        }
    }
/** 
* This method cancels the seat
* @param ticket, the ticket
*/
    public boolean cancelSeat(Ticket ticket)
    {
        if (ticket.getSeatNumber() != null)
        {
            System.out.println(ticket.getSeatNumber() + " Cancelled");
            return true;
        }
        return false;
    }
}
