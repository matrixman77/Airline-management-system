/**
* Tyler Barber
*/
public class Booking
{
    private short totalSeats;
    private short availSeats;
    private short takenSeats;
    private String[] seatNumbers;
    private Flight flight;
/**
* This constructor sets totalSeats, availSeats to totalSeats, takenSeats to zero, and sets flight
* @param totalSeats, the total amount of seats
* @param flight, the flight
*/
    public Booking(short totalSeats, Flight flight)
    {
        this.totalSeats = totalSeats;
        this.availSeats = totalSeats;
        this.takenSeats = 0;
        this.flight = flight;
        generateSeatNumbers();
    }
/**
* This method generates seat numbers
*/
    public void generateSeatNumbers()
    {
        seatNumbers = new String[totalSeats];
        
        for (int i = 0; i < totalSeats; i++)
        {
            seatNumbers[i] = "Seat-" + (i + 1);
        }
    }
/**
* This method assigns a seat 
* @return, the seat
*/
    public String assignSeat()
    {
        if (availSeats == 0)
        {
            return null;
        }
        
        String seat = seatNumbers[takenSeats];
        takenSeats++;
        availSeats--;
        return seat;
    }
/**
* This method returns the total seats
* @return, the totalSeats
*/
    public short getTotalSeats()
    {
        return totalSeats;
    }
/**
* This method returns the available seats 
* @return, the availSeats
*/
    public short getAvailSeats()
    {
        return availSeats;
    }
/**
* This method returns the taken seats
* @return, the takenSeats
*/
    public short getTakenSeats()
    {
        return takenSeats;
    }
}
