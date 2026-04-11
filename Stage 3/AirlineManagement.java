/**
 * @author Jonathon Martinez
 * This class is used to manage the airline information.
 */
import java.util.ArrayList;

public class AirlineManagement {
    private ArrayList<String> flightNumbers;
    private ArrayList<String> gateNumber;
    private ArrayList<String> airName;

    /**
     * Constructor for AirlineManagement class.
     */
    public AirlineManagement() {
        flightNumbers = new ArrayList<>();
        gateNumber = new ArrayList<>();
        airName = new ArrayList<>();
    }

    /**
     * Adds a flight to the airline management system.
     * @param flightNumber
     * @param gateNumber
     * @param airName
     */
    public void addFlight(String flightNumber, String gateNumber, String airName) {
        this.flightNumbers.add(flightNumber);
        this.gateNumber.add(gateNumber);
        this.airName.add(airName);
    }

    /**
     * Adds a terminal number to the airline management system.
     * @param gateNumber The terminal number to add.
     */
    public void addTerminalNumber(String gateNumber) {
        this.gateNumber.add(gateNumber);       
    }

    /**
     * Adds an airline name to the airline management system.
     * @param airName The airline name to add.
     */
    public void addAirlineName(String airName) {
        this.airName.add(airName);
    }

    /**
     * Removes a flight from the airline management system.
     * @param flightNumber
     */
    public void removeFlightNumber(String flightNumber) {
        this.flightNumbers.remove(flightNumber);
    }

    /**
     * Removes a terminal number from the airline management system.
     * @param gateNumber
     */
    public void removeTerminalNumber(String gateNumber) {
        this.gateNumber.remove(gateNumber);
    }

    /**
     * Removes an airline name from the airline management system.
     * @param airName The airline name to remove.
     */
    public void removeAirlineName(String airName) {
        this.airName.remove(airName);
    }
}

