package chain;

public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		// TODO Auto-generated method stub
		if(o.getDifficulty()>5) {
			System.out.println("Waiter can't handle this");
			this.successor.processOrder(o);	//daca nu stie sa faca, paseaza responsabilitatea
		}else {
			System.out.println("I am handling this: "+ o.getName()); //daca stie, o face
		}
	}
	



}
