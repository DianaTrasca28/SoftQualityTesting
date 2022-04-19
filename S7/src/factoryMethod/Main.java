package factoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryCheapWeapon factory = new FactoryCheapWeapon();
		IWeapon weapon = factory.create();
	}

}
