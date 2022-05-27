package memento;

public class Contract {

	//versiunea origiala
	private String clientName;
	private String clauseContract;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClauseContract() {
		return clauseContract;
	}
	public void setClauseContract(String clauseContract) {
		this.clauseContract = clauseContract;
	}
	
	public Contract(String clientName) {
		super();
		this.clientName = clientName;
	}
	public Contract(String clientName, String clauseContract) {
		super();
		this.clientName = clientName;
		this.clauseContract = clauseContract;
	}
	
	@Override
	public String toString() {
		return "Contract [clientName=" + clientName + ", clauseContract=" + clauseContract + "]";
	}
	
	//add new clause method
	public void addClause(String newClause) {
		this.clauseContract+=newClause+"\n";
	}
	
	//restore old version method folosind clasa ManagerVersions (
	public void restoreOldVersion(ContractVersion clauseVersion) {
		//this.clauseContract=clauseVersion;
		System.out.println("restore specific version of the contract");
		this.clauseContract=clauseVersion.getClauseVersion();
	}
	
	//save version
	public ContractVersion saveVersion() {
		System.out.println("save version of the contract");
		return new ContractVersion(this.clauseContract);
	}
}
