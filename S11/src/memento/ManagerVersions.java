package memento;

import java.util.ArrayList;

public class ManagerVersions {

	private ArrayList<ContractVersion> contractVersions=new ArrayList<ContractVersion>();
	

	public ArrayList<ContractVersion> getContractVersions() {
		return contractVersions;
	}

	public void setContractVersions(ArrayList<ContractVersion> contractVersions) {
		this.contractVersions = contractVersions;
	}

	public ManagerVersions(ArrayList<ContractVersion> contractVersions) {
		super();
		this.contractVersions = contractVersions;
	}
	
	public void addVersion(ContractVersion newContractVersion) {
		this.contractVersions.add(newContractVersion);
	}
	public ContractVersion recoveryVersionContract(int nrVersion) {
		return this.contractVersions.get(nrVersion);
	}

	public ManagerVersions() {
		super();
	}
	
	
}
