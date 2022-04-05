package builder.resolved;

public class ProgMain {

	public static void main(String[] args) {
	
		User user=new User.Userbuilder("diana123", "123", "diana@csie").address("bucharest").build();

	}

}
