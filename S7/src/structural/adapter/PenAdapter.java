package structural.adapter;

public class PenAdapter implements Pen{

	PilotPen p = new PilotPen();
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		p.delete();
	}

}
