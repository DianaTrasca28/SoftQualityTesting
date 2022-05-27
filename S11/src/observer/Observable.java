package observer;

import java.util.ArrayList;

public class Observable {
//clasa cu lucru care este observabil
	ArrayList<ISubscriber>listObservers=new ArrayList<>();
	public void addObserver(ISubscriber newSubscriber) {
		this.listObservers.add(newSubscriber);
	}
	public void removeObserver(ISubscriber subscriber) {
		this.listObservers .remove(subscriber);
	}
	public void notifyAllObservers() {
		for(int i=0; i<listObservers.size(); i++)
			listObservers.get(i).act();
	}
}
