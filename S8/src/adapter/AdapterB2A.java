package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB{

	@Override
	public double calculateDiscountB(Client client) {
		// TODO Auto-generated method stub
		//Var1
		//this.calculateDiscountA(client.getNrOrders());
		//Var2
		System.out.println("Method B2");
		int total=0;
		for(int i=0;i<client.getNrOrders();i++) {
			total+=client.getOrders()[i];
		}
		this.calculateDiscountA(total);
		return 0;
	}

	

}
