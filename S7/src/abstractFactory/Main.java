package abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop(new HighBudgetFactory());
		shop.createPackage();
	}

}
