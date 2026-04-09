/** 
* Tyler Barber
*/
import java.util.ArrayList;

public class FlightManagement
{
    private ArrayList<Flight> flights;
/** 
* This constructor initializes the list of flights
*/
    public FlightManagement()
    {
        this.flights = new ArrayList<>();
    }
/** 
* This method adds a flight to the list
* @param flight, the flight
*/
    public void addFlight(Flight flight)
    {
        flights.add(flight);
    }
/** 
* This method changes the destination
* @param newDestination, the new destination of the flight
*/
    public void changeDestination(String newDestination)
    {
        for (Flight f : flights)
        {
            f.setDestination(newDestination);
        }
    }
/** 
* This method changes the starting location
* @param newStartLocal, the new starting location of the flight
*/
    public void changeStartLocal(String newStartLocal)
    {
        for (Flight f : flights)
        {
            f.setStartLocal(newStartLocal);
        }
    }
}
