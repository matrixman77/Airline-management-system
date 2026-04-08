public class BookingManagement
{
    private BookingInformation booking;
    
    public BookingManagement(short totalSeats)
    {
        this.booking = new BookingInformation(totalSeats);
    }
    
    public void bookSeat(short seatNumber)
    {
        return booking.assignSeatToTicket(seatNumber);
    }
    
    public boolean cancelSeat(short seatNumber)
    {
        return booking.cancelSeat(seatNumber);
    }
}
