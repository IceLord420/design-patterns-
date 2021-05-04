package observe;

import java.util.Observable;
import java.util.Observer;

public class UserObserve implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		BitcoinPriceObservable bitcoinPriceObservable = (BitcoinPriceObservable) o;
		
		System.out.println("User is notified, Price has changed to " + bitcoinPriceObservable.getPrice());
	}

}
