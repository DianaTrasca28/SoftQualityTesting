package facade;

public class Hotel {

	private String name;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hotel(String name) {
		super();
		this.name = name;
	}
	public void roomBooking(String location) {
		System.out.println("Hotel "+name+" location "+location);
	}
	
}
