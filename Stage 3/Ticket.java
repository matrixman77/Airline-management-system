/** 
* Tyler Barber
*/
import java.util.ArrayList;
import java.time.LocalDate;

public class Ticket
{
    private float price;
    private int ticketNumber;
    private String flightClass;
    private LocalDate flightDate;
    private Flight flight;
    private String seatNumber;
    private Passenger passenger;
    private ArrayList<Short> departureTimes;
    private ArrayList<Short> arrivalTimes;
    private ArrayList<Short> boardingTimes;

/**
* This constructor sets the instance variables to each other
* @param ticketNumber, the ticket number
* @param price, the ticket price
* @param flightClass, the class of the flight
* @param flightDate, the date of the flight
* @param flight, the flight
*/
    public Ticket (int ticketNumber, float price, String flightClass, LocalDate flightDate, Flight flight, Passenger passenger, ArrayList<Short> departureTimes, ArrayList<Short> arrivalTimes, ArrayList<Short> boardingTimes)
    {
        this.price = price;
        this.ticketNumber = ticketNumber;
        this.flightClass = flightClass;
        this.flightDate = flightDate;
        this.flight = flight;
        this.passenger = passenger;
        this.departureTimes = departureTimes;
        this.arrivalTimes = arrivalTimes;
        this.boardingTimes = boardingTimes;
    }
/** 
* This method assigns the seat number to the reserved seat
* @param seat, the seat
*/
    public void assignSeat(String seat)
    {
        this.seatNumber = seat;
    }
/** 
* This method returns the price
* @return, the price
*/
    public float getPrice()
    {
        return price;
    }
/** 
* This method returns the ticket number
* @return, the ticketNumber
*/
    public int getTicketNumber()
    {
        return ticketNumber;
    }
/** 
* This method returns the flight class
* @return, the flightClass
*/
    public String getFlightClass()
    {
        return flightClass;
    }
/** 
* This method returns the flight date
* @return, the flightDate
*/
    public LocalDate getFlightDate()
    {
        return flightDate;
    }
/** 
* This method returns the flight
* @return, the flight
*/
    public Flight getFlight()
    {
        return flight;
    }
/** 
* This method returns the seat number
* @return, the seatNumber
*/
    public String getSeatNumber()
    {
        return seatNumber;
    }
/** 
* This method returns the passenger
* @return, the passenger
*/
    public Passenger getPassenger()
    {
        return passenger;
    }  
/** 
* This method returns the departure times
* @return, the departure times
*/
    public ArrayList<Short> getDepartureTimes()
    {
        return departureTimes;
    }
/** 
* This method returns the arrival times
* @return, the arrival times
*/
    public ArrayList<Short> getArrivalTimes()
    {
        return arrivalTimes;
    }
/** 
* This method returns the boarding times
* @return, the boarding times
*/
    public ArrayList<Short> getBoardingTimes()
    {
        return boardingTimes;
    }
/** 
* This method sets the price
* @param price, the price
*/
    public void setPrice(float price)
    {
        this.price = price;
    }
/** 
* This method sets the flight class
* @param flightClass, the class of the flight 
*/
    public void setFlightClass(String flightClass)
    {
        this.flightClass = flightClass;
    }
/** 
* This method sets the flight date
* @param flightDate, the date of the flight
*/
    public void setFlightDate(LocalDate flightDate)
    {
        this.flightDate = flightDate;
    }
}
