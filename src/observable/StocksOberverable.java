package observable;

import observer.NotificationAlertObserver;

public interface StocksOberverable {

	public void addStocks(NotificationAlertObserver notificationAlertObserver);
	public void removeStocks(NotificationAlertObserver notificationAlertObserver);
	public void notifySubscribers();
	public void setStockCount(int newStockAdded);
	public int getStockCount(); 
}
