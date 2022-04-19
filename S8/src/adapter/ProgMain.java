package adapter;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []v=new int[2];
		Client c=new Client("Mada",2, v);
		IDiscountB discount=new AdapterB2A();
		discount.calculateDiscountB(c);

	}

}
