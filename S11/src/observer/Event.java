package observer;

public class Event extends Observable{

	//rain
	private String info;
	private boolean activated=false;
	
	private void activateRain() {
		if(activated!=true) {
			activated=true;
			this.notifyAllObservers();
		}
	}
	public void publicateEvent() {
		System.out.println("Event started");
		activateRain();
	}
}
