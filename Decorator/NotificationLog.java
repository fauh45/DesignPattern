package Decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificationLog implements Notification {
    FileWriter writer;

    public NotificationLog(String path) {
        try {
            this.writer = new FileWriter(path);
        } catch (IOException e) {
            System.out.println("Writer error, notification will not be logged");
            this.writer = null;
        }
    }

    @Override
    public void sendNotification(String from, String message) {
        try {
            if (this.writer != null) {
                this.writer.write("[" + this.getCurrentTime() + "] From : " + from + "\nMessage : \n" + message + "\n");
                this.writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Write Failed!");
        }
    }

    private String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
    }

}