package abstractFactory;

public class LowBugetFactory implements IFactory {

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new CheapCostume();
	}

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new CheapWeapon();
	}

}
