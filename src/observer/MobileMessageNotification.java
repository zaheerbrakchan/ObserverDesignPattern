package observer;

import observable.StocksOberverable;

public class MobileMessageNotification implements NotificationAlertObserver {

	public String mobileNo;
	public StocksOberverable observable;
	
	public MobileMessageNotification(String mobileNo,StocksOberverable observable) {
		this.mobileNo=mobileNo;
		this.observable=observable;
	}
	
	@Override
	public void update() {
		sendSMS(this.mobileNo,"New Iphone Stock is Available!!!!");
		
	}

	public void sendSMS(String mobileNo,String notifications) {
		System.out.println("SMS Notification to : "+mobileNo+ " notification : "+notifications);;
	}
}
