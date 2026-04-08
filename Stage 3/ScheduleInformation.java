/**
 * @author Jonathon Martinez
 * This class is used to store information about a flight schedule.
 */
public class ScheduleInformation {
    private short departureTime;
    private short arrivalTime;
    private short delayedFlight;
    private short cancelledFlight;
    private short boardingTime;

    /**
     * Constructor for ScheduleInformation class.
     * @param departureTime The departure time of the flight.
     * @return The departure time.
     */
    public short getDepartureTime() {
        return departureTime;
    }

    /**
     * Gets the arrival time of the flight.
     * @return The arrival time.
     */
    public short getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Gets the delayed flight status.
     * @return The delayed flight status.
     */
    public short getDelayedFlight() {
        return delayedFlight;
    }

    /**
     * Gets the cancelled flight status.
     * @return The cancelled flight status.
     */
    public short getCancelledFlight() {
        return cancelledFlight;
    }

    /**
     * Gets the boarding time of the flight.
     * @return The boarding time.
     */
    public short getBoardingTime() {
        return boardingTime;
    }
}

