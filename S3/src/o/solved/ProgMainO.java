package o.solved;

public class ProgMainO {

	public static void main(String[] args) {
		Employee emmJohn=new FteEmployee(1, "Ion", 2000);	//up casting; comportament de interfata
		System.out.println(emmJohn.toString()+" BONUS: "+emmJohn.calculateBonus());
		Employee emmMichael=new VendorEmployee(1, "Michael", 2000);
		System.out.println(emmJohn.toString()+" BONUS: "+emmJohn.calculateBonus());

	}

}
