package singletone;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Database d1=new Database();
		//Database d2=new Database();
		//facem o metoda statica pt a ne connecta o singura data, si sa nu permitem
		Database d1=Database.getInstance();
		Database d2=Database.getInstance();

	}
	

}
