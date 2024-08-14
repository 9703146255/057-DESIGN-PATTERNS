package in.thiru.factory;

public class MainFactory {
	
	public static void main(String[] args) {
		NotificationFactory notification=new NotificationFactory();
		Notification smsNotification = notification.createNotification("SMS");
		smsNotification.sendNotification();
		Notification emailNotification = notification.createNotification("EMAIL");
		emailNotification.sendNotification();
		Notification pushNotification = notification.createNotification("PUSH");
		pushNotification.sendNotification();

	}

}
