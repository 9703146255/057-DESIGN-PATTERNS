package in.thiru.factory;

public class SMSNotification implements Notification{
	@Override
	public void sendNotification() {
		System.out.println("Sending SMSNotification.....");
	}

}
