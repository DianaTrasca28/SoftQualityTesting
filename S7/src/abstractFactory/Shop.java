package abstractFactory;

public class Shop {
	IFactory factoryCategory;
	public Shop(IFactory category) {
		this.factoryCategory = category;
	}

	public void createPackage() {
		
		ICostume costume = this.factoryCategory.createCostume();
		IWeapon weapon = this.factoryCategory.createWeapon();
		
		costume.protection();
		weapon.power();
	}

}
