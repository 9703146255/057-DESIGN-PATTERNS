package in.thiru.factory;

public class NotificationFactory {
	
	public Notification createNotification(String type)
	{
		switch(type)
		{
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PUSHNotification();
		default:
			throw new IllegalArgumentException("not found notification for this type");
		}
	}

}
