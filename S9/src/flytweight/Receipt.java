package flytweight;

public class Receipt implements IReceipt{

	private static ReceiptEnum receiptType;
	
	public Receipt(ReceiptEnum receiptType) {
		super();
		this.receiptType = receiptType;
	}

	public void setReceipt(ReceiptEnum receiptType) {
		this.receiptType = receiptType;
	}
	public static ReceiptEnum getReceipt() {
		return receiptType;
	}
	

	@Override
	public void printReceipt(ReceiptData data) {
		// TODO Auto-generated method stub
		System.out.println("This receipt is "+this.receiptType+data.getPrice());
	}

}
