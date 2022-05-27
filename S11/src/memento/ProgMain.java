package memento;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManagerVersions caretaker=new ManagerVersions();
		Contract originalContract=new Contract("Diana");
		caretaker.addVersion(originalContract.saveVersion()); //
		
		originalContract.addClause("increase salary 14%");//v1
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		System.out.println("-------------------------");
		
		originalContract.addClause("note period change");//v2
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		System.out.println("-------------------------");
		
		originalContract.addClause("manager-note period change");//v3
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		System.out.println("-------------------------");
		
		ContractVersion desiredVersion=caretaker.recoveryVersionContract(0);
		originalContract.restoreOldVersion(desiredVersion);
		System.out.println(originalContract );
		System.out.println("-------------------------");
		
		
	}

}
