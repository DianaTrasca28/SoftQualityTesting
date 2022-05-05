package facade;

public class ProgMain {

	public static void main(String[] args) {
		//clientul isi asigura calatoria intr-un mod complicat
//		Hotel hotel=new Hotel("London Hilton");
//		hotel.roomBooking("London");
//		
//		Airline airline=new Airline("BlueAir");
//		Flight toGo=airline.flightBooking("Bucharest", "London");
//		Flight back=airline.flightBooking("Londin", "Bucharest");
		
		//clientul foloseste fatada
		Facade.reservation("Bucharest", "London");
	}

}
