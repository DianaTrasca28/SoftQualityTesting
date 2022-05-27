package observer;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Event event=new Event();
		ISubscriber Diana=new SubscriberA();
		ISubscriber Ana=new SubscriberB();
		
		
		
		event.addObserver(Ana);
		
		event.publicateEvent();
	}

}
