package adapter;

public class DiscountB implements IDiscountB{


	@Override
	public double calculateDiscountB(Client client) {
		/*if(client.getNrOrders()>100) {
			return 0.1;
		}
		if(client.getNrOrders()>50&&client.getNrOrders()<=100) {
			return 0.05;
		}
		return 0;*/

	int total=0;
	for(int i=0; i<client.getNrOrders();i++) {
		total+=client.getOrders()[i];
	}
	if(total>1000) {
		return 0.3;
	}
	if(total>500&&total<=1000) {
		return 0.2;
	}
	return 0;
	}
}
