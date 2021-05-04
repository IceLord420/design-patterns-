package observe;

public class ObserveMain {

	public static void main(String[] args) {
		BitcoinPriceObservable bitcoinPriceObservable = new BitcoinPriceObservable(52326.23);
		
		AdminObserve adminObserve = new AdminObserve();
		UserObserve userObserve = new UserObserve();
		
		bitcoinPriceObservable.addObserver(userObserve);
		bitcoinPriceObservable.addObserver(adminObserve);
		
		bitcoinPriceObservable.setPrice(60000);
	}

}
