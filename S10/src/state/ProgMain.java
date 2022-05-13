package state;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setState(EState.WORKING);
		emp.perform("UX bug");
		
		emp.setState(EState.VACATION);
		emp.perform("server down");

	}

}
