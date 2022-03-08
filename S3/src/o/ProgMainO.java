package o;

public class ProgMainO {

	public static void main(String[] args) {
		Employee emmJohn=new Employee(1, "Ion", 2000, "FTE");
		System.out.println(emmJohn.toString()+" BONUS: "+emmJohn.calculateBonus());
		Employee emmMichael=new Employee(1, "Michael", 2000, "Vendor");
		System.out.println(emmJohn.toString()+" BONUS: "+emmJohn.calculateBonus());

	}

}
