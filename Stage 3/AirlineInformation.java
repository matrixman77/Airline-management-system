/**
 * @author Jonathon Martinez
 * This class is used to store information about an airline.
 * 
 */
public class AirlineInformation {
    private String flightNumber;
    private String planeType;
    private String terminalNumber;
    private String airlineName;
    
    /**
     * Constructor for AirlineInformation class.
     * @param flightNumber The flight number of the airline.
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the plane type of the airline.
     * @return The plane type.
     */
    public String getPlaneType() {
        return planeType;
    }

    /**
     * Gets the terminal number of the airline.
     * @return The terminal number.
     */
    public String getTerminalNumber() {
        return terminalNumber;
    }

    /**
     * Gets the airline name.
     * @return The airline name.
     */
    public String getAirlineName() {
        return airlineName;
    }
}
