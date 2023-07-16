package observer;

import observable.StocksOberverable;

public class EmailNotification implements NotificationAlertObserver {
	
public String userName;
public StocksOberverable observable;

public EmailNotification(String emailId,StocksOberverable observable) {
	this.userName=emailId;
	this.observable=observable;
}
	
	@Override
	public void update() {
		sendEmail(this.userName,"New Iphone Stock is Available!!!!");
		
	}
	
	public void sendEmail(String emailId,String notifications) {
		System.out.println("Email Notification to : "+emailId+ " notification : "+notifications);;
	}

}
