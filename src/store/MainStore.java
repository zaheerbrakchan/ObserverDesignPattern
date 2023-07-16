package store;

import observable.IPhoneStockObserverable;
import observable.StocksOberverable;
import observer.EmailNotification;
import observer.MobileMessageNotification;
import observer.NotificationAlertObserver;

public class MainStore {

	public static void main(String[] args) {
		
		StocksOberverable iPhoneObservable = new IPhoneStockObserverable();
		
		NotificationAlertObserver observer1 = new EmailNotification("xaheer3scc@gmail.com", iPhoneObservable);
		NotificationAlertObserver observer2 = new EmailNotification("daryl123@gmail.com", iPhoneObservable);
		NotificationAlertObserver observer3 = new MobileMessageNotification("7889511370", iPhoneObservable);

		iPhoneObservable.addStocks(observer1);
		iPhoneObservable.addStocks(observer2);
		iPhoneObservable.addStocks(observer3);
		
		iPhoneObservable.setStockCount(10);
		iPhoneObservable.setStockCount(0);
		iPhoneObservable.setStockCount(10);
	}

}
