package template;

public class InsuranceProcedure extends AInsuranceProcedure{

	@Override
	protected void identifyDamage() {
		// TODO Auto-generated method stub
		System.out.println("I am identifying the issues");
	}

	@Override
	protected void evaluateDamage() {
		// TODO Auto-generated method stub
		System.out.println("For the issues identified, I am evaluating");
	}

	@Override
	protected void sendInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Sending the results");
		
	}

}
