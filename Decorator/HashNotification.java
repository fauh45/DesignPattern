package Decorator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashNotification extends NotificationDecorator {
    public HashNotification(Notification wrapee) {
        super(wrapee);
    }

    @Override
    public void sendNotification(String from, String message) {
        super.sendNotification(from, encrypt(message));
    }

    public String encrypt(String message) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");

            messageDigest.update(message.getBytes());
            String encryptedString = new String(messageDigest.digest());

            return encryptedString;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Message will not be hashed!");
            return message;
        }
    }
}