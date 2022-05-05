package facade;

public class Flight {

	private String initialLocation;
	private String destination;
	private Airline airline;
	
	public Flight(String initialLocation, String destination, Airline airline) {
		super();
		this.initialLocation = initialLocation;
		this.destination = destination;
		this.airline = airline;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getInitialLocation() {
		return initialLocation;
	}
	public void setInitialLocation(String initialLocation) {
		this.initialLocation = initialLocation;
	}
	@Override
	public String toString() {
		return "Flight [initialLocation=" + initialLocation + ", destination=" + destination + ", airline=" + airline
				+ "]";
	}
	
}
