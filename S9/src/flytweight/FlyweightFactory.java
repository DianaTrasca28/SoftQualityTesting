package flytweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static Map<ReceiptEnum, Receipt> listReceipt=new HashMap<ReceiptEnum,Receipt>();
	public static Receipt getReceipt(ReceiptEnum type) {
		Receipt rec=new Receipt(type);
		listReceipt.put(type, rec);
//		switch (type) {
//		case type:{
//			//yeld type
//		}default:
//			throw new IllegalArgumentException("Unexpected value: "+ type);
//		}
		return rec;
	}
	
	public static int getNoReceipt() {
		return listReceipt.size();
	}
}
	

