package Decorator;

/**
 * NotificationDecorator
 */
public abstract class NotificationDecorator implements Notification {
    protected Notification wrapee;

    public NotificationDecorator(Notification wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void sendNotification(String from, String message) {
        System.out.println("Got message from : " + from + ", with message :\n" + message);
        wrapee.sendNotification(from, message);
    }
}