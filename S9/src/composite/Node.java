package composite;

public class Node extends ANode{

	//clasa pt frunze
	private String name;
	private float price;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public Node(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	

	
}
