import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		this.observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = this.observers.indexOf(deleteObserver);
		this.observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : this.observers){
			observer.update(this.ibmPrice, this.aaplPrice, this.googPrice);
		}
	}

	public void setIBMPrice(double newPrice){
		this.ibmPrice = newPrice;
		this.notifyObserver();
	}

	public void setAAPLPrice(double newPrice){
		this.aaplPrice = newPrice;
		this.notifyObserver();
	}
	
	public void setGOOGPrice(double newPrice){
		this.googPrice = newPrice;
		this.notifyObserver();
	}

}
