package chain;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1=new Order("Pizza", 15);
		Order o2=new Order("Cafea", 3);
		
		AHandler waiter=new Waiter();
		AHandler chief=new Chief();
		waiter.setSuccessor(chief);//setam ierarhia
		
		waiter.processOrder(o1);
		waiter.processOrder(o2);

	}

}
