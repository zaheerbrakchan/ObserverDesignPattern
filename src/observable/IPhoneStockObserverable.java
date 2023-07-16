package observable;

import java.util.ArrayList;
import java.util.List;

import observer.NotificationAlertObserver;

public class IPhoneStockObserverable implements StocksOberverable {

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount=0;
	
	@Override
	public void addStocks(NotificationAlertObserver notificationObserver) {
		
		observerList.add(notificationObserver);
	}

	@Override
	public void removeStocks(NotificationAlertObserver notificationObserver) {
		observerList.remove(notificationObserver);
		
	}

	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer : observerList) {
			observer.update();
		}
		
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount=newStockAdded;
	}

	@Override
	public int getStockCount
	() {
		
		return stockCount;
	}

}
