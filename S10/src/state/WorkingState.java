package state;

public class WorkingState implements IState{

	@Override
	public void act(String task) {
		// TODO Auto-generated method stub
		System.out.println("This employee works on it"+task);
	}

}
