package memento;

public class ContractVersion {

	private String clauseVersion;

	public ContractVersion(String clauseVersion) {
		super();
		this.clauseVersion = clauseVersion;
	}

	public ContractVersion() {
		super();
		this.clauseVersion=""; 
	}

	public String getClauseVersion() {
		return clauseVersion;
	}

	public void setClauseVersion(String clauseVersion) {
		this.clauseVersion = clauseVersion;
	}
	
	
}
