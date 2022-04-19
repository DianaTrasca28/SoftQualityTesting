package abstractFactory;

public class HighBudgetFactory implements IFactory {

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new MagicCostume();
	}

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new MagicWeapon();
	}

}
