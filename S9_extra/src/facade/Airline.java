package facade;

public class Airline {
	private String name;

	public Airline(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Airline [name=" + name + "]";
	}
	public Flight flightBooking(String initialLocation, String destination) {
		Flight flight=new Flight(initialLocation, destination, this);
		return flight;
	}
	
}
