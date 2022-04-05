package prototype.resolved;

public class ProgMmain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bookshop carturesti=Bookshop.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		
		Bookshop diverta=(Bookshop) carturesti.clone();
		diverta.getListBooks().remove(2);
		
		System.out.println("DEEP copy");
		System.out.println(carturesti);
		

	}

}
