package Decorator;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Notification notificationSystem;
        notificationSystem = new NotificationLog("./log.txt");
        notificationSystem = new SmartSpeakerNotfication(notificationSystem, "Yeet#1");
        notificationSystem = new HashNotification(notificationSystem);

        notificationSystem.sendNotification("Yeet#2", "I want fooodddd!!!");
    }
}