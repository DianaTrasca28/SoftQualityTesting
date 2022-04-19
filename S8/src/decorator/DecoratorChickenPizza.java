package decorator;

public class DecoratorChickenPizza extends DecoratorPizza{

	public DecoratorChickenPizza(APizza p) {
		super(p);
	}

	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		super.getIngredients();
		System.out.println("+chicken");
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		super.calculateCost();
		System.out.println("+10 (lei chicken)");
	}
	

}
