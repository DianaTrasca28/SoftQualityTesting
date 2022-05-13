package state;

public class AwayState implements IState{

	@Override
	public void act(String task) {
		// TODO Auto-generated method stub
		System.out.println("This employee will prioritize this "+ task);
	}

}
