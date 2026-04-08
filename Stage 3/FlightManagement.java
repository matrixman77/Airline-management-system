import java.util.ArrayList;

public class FlightManagement
{
    private ArrayList<Flight> flights;
    
    public FlightManagement()
    {
        this.flights = new ArrayList<>();
    }
    
    public void addFlight(Flight flight)
    {
        flights.add(flight);
    }
    
    public void changeDestination(String newDestination)
    {
        for (FLight f : flights)
        {
            f.setDestination(newDestination);
        }
    }
    
    public void changeStartLocal(String startLocal)
    {
        for (FLight f : flights)
        {
            f.setStartLocal(newStartLocal);
        }
    }
}
