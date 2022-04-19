package decorator;

public class PizzaBasic extends APizza {

	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		System.out.println("dough, ketchup, mozzarella");
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		System.out.println("20 (price)");
	}
	

}
