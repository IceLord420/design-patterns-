package observe;

import java.util.Observable;

public class BitcoinPriceObservable extends Observable{
	private double price;

	public BitcoinPriceObservable(double price) {
		this.price = price;
	}
	
	public void setPrice(double newPrice) {
		if(price != newPrice) {
			System.out.println("Price was " + price + " and has changed to "+ + newPrice);
			price = newPrice;
			
			setChanged();
			
			notifyObservers();
		}
	}
	
	public double getPrice()
	{
		return price;
	}

}
