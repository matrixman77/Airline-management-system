/**
 * @author Jonathon Martinez
 * This class is used to manage the flight schedule information.
 */
public class ScheduleManagement {
    private ArrayList<departureTime> departureTimes;
    private ArrayList<arrivalTime> arrivalTimes;
    private ArrayList<delayedFlight> delayedFlights;
    private ArrayList<cancelledFlight> cancelledFlights;
    private ArrayList<boardingTime> boardingTimes;
    
    /**
     * Constructs a new ScheduleManagement object.
     */
    public ScheduleManagement() {
        this.departureTimes = new ArrayList<>();
        this.arrivalTimes = new ArrayList<>();
        this.delayedFlights = new ArrayList<>();
        this.cancelledFlights = new ArrayList<>();
        this.boardingTimes = new ArrayList<>();
    }

    /**
     * Updates the departure time for a flight.
     * @param departureTime the new departure time
     */
    public void updateDepartureTime(short departureTime) {
        this.departureTimes.add(departureTime);
    }

    /**
     * Updates the arrival time for a flight.
     * @param arrivalTime the new arrival time
     */
    public void updateArrivalTime(short arrivalTime) {
        this.arrivalTimes.add(arrivalTime);
    }

    /**
     * Updates the delayed flight information.
     * @param delayedFlight the new delayed flight information
     * @return true if the update was successful, false otherwise
     */
    public boolean updateDelayedFlight(short delayedFlight) {
        this.delayedFlights.add(delayedFlight);
    }

    /**
     * Updates the cancelled flight information.
     * @param cancelledFlight the new cancelled flight information
     * @return true if the update was successful, false otherwise
     */
    public boolean updateCancelledFlight(short cancelledFlight) {
        this.cancelledFlights.add(cancelledFlight);
        return true;
    }

    /**
     * Updates the boarding time for a flight.
     * @param boardingTime the new boarding time
     */
    public void updateBoardingTime(short boardingTime) {
        this.boardingTimes.add(boardingTime);
    }

}
