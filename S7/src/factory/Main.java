package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IWeapon weapon=new MagicWeapon();	//this has to be hidden

		//FactoryWeapon factory=new FactoryWeapon();
		try {
				IWeapon weapon;
				weapon=FactoryWeapon.create(200);
				weapon.power();
			}
		catch(Exception e) {}
		

	}

}
