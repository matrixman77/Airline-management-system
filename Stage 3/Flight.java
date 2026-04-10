/**
* Tyler Barber
*/
public class Flight
{
	private String destination;
	private String startLocal;
	private short totalDistance;
	private short avgSpeed;
	private short flightTime;
/**
* This constructor sets the instance variables to each other
* @param destination, the destination
* @param startLocal, the starting location
* @param totalDistance, the total distance of the flight
* @param avgSpeed, the average speed of the flight
*/
	public Flight(String destination, String startLocal, short totalDistance, short avgSpeed)
	{
		this.destination = destination;
		this.startLocal = startLocal;
		this.totalDistance = totalDistance;
		this.avgSpeed = avgSpeed;
		this.flightTime = calcFlightTime;
	}
/**
* This method calculates the flight time
* @return, the flight time calculation
*/
	private short calcFlightTime()
	{
		return (short)(totalDistance / avgSpeed);
	}
/**
* This method returns the destination
* @return, the destination
*/
	public String getDestination()
	{
		return destination;
	}
/**
* This method returns the starting location
* @return, the starting location
*/
	public String getStartLocal()
	{
		return startLocal;
	}
/**
* This method returns the total distance
* @return, the total distance
*/
	public short getTotalDistance()
	{
		return totalDistance;
	}
/**
* This method returns the average speed
* @return, the average speed
*/
	public short getAvgSpeed()
	{
		return avgSpeed;
	}
/**
* This method returns the flight time
* @return, the flight time
*/
	public short getFlightTime()
	{
		return flightTime;
	}
/**
* This method sets the destination
* @param destination, the destination
*/
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
/**
* This method sets the starting location
* @param startLocal, the starting location
*/
	public void setStartLocal(String startLocal)
	{
		this.startLocal = startLocal;
	}
}
