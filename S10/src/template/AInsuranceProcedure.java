package template;

public abstract class AInsuranceProcedure {

	protected abstract void identifyDamage();
	protected abstract void evaluateDamage();
	protected abstract void sendInsurance();
	
	public void templateInsurance() {	//se pune o ordine precisa
		identifyDamage();
		evaluateDamage();
		sendInsurance();
	}
}
