package chain;

public abstract class AHandler {

	protected AHandler successor=null;
	public abstract void processOrder(Order o);
	public void setSuccessor(AHandler successor) {
		this.successor=successor;
	}
	
}
