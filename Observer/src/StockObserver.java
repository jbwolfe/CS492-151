
public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		
		this.observerID = ++observerIDTracker;
		
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println(this.observerID + "\n" + 
				"IBM: " + this.ibmPrice + "\n" +
				"Apple: " + this.aaplPrice + "\n" +
				"Google: " + this.googPrice);
	}

}
