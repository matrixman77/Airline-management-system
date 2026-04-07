public class AirlineManagement {
    //private ArrayList<planeType> planes;
    private ArrayList<flightNumber> flightNumbers;
    private ArrayList<gateNumber> gateNumber;
    private ArrayList<airName> airName;

    public AirlineManagement() {
        flightNumbers = new ArrayList<>();
        gateNumber = new ArrayList<>();
        airName = new ArrayList<>();
    }

    public void addFlight(String flightNumber, String gateNumber, String airName) {
        this.flightNumbers.add(flightNumber);
        this.gateNumber.add(gateNumber);
        this.airName.add(airName);
    }

    //public addPlaneType() {}

    public void addTerminalNumber(String gateNumber) {
        this.gateNumber.add(gateNumber);       
    }

    public void addAirlineName(String airName) {
        this.airName.add(airName);
    }

    public void removeFlightNumber(String flightNumber) {
        this.flightNumbers.remove(flightNumber);
    }

    //public void removePlaneTYpe(String planeType) {}

    public void removeTerminalNumber(String gateNumber) {
        this.gateNumber.remove(gateNumber);
    }

    public void AirlineName(String airName) {
        this.airName.remove(airName);
    }
}
