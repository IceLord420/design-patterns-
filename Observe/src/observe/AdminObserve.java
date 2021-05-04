package observe;

import java.util.Observable;
import java.util.Observer;

public class AdminObserve implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		BitcoinPriceObservable bitcoinPriceObservable = (BitcoinPriceObservable) o;
		
		System.out.println("Admin is notified, Price has changed to " + bitcoinPriceObservable.getPrice());
	}

}
