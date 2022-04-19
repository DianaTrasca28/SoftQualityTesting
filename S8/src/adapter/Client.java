package adapter;

public class Client {
	private String name;
	private int nrOrders;
	private int[] orders;
	public Client(String name, int nrOrders, int[] orders) {
		super();
		this.name = name;
		this.nrOrders = nrOrders;
		this.orders = orders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNrOrders() {
		return nrOrders;
	}
	public void setNrOrders(int nrOrders) {
		this.nrOrders = nrOrders;
	}
	public int[] getOrders() {
		return orders;
	}
	public void setOrders(int[] orders) {
		this.orders = orders;
	}

}
