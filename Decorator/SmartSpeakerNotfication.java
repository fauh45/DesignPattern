package Decorator;

public class SmartSpeakerNotfication extends NotificationDecorator {
    private String id;

    public SmartSpeakerNotfication(Notification wrapee, String id) {
        super(wrapee);

        this.id = id;
    }

    @Override
    public void sendNotification(String from, String message) {
        this.notifyDevice(from, message);

        super.sendNotification(from, message);
    }

    private void notifyDevice(String from, String message) {
        System.out.println("Sending message to id " + this.id + ", from : " + from + ", with message : \n" + message);
    }

}