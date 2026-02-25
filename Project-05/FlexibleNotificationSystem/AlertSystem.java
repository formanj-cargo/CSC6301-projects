/**
 * @author Jacqueline Forman 
 * @version 3.0
 * 
 * alert system for the notification medium, sends message and keeps a log of all the notfications 
 * 
 * week 5 - 
 * Added WhatsApp functionality, from WhatsAppService.java 
 */

import java.util.ArrayList;
import java.util.List;

public class AlertSystem {
    private NotificationMedium medium;
    /**The current notification medium */
    private List<String> messageLog;
    /**log of messages sent during the session */
    public AlertSystem() {
        this.messageLog = new ArrayList<>();
    }
    /**
     * creates the new alert system without anything in log 
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }
    /**
     * sets notifications to be used by the alert system
     * @param medium the notification medium to be used
     */
    public void notifyUser(String message) {
        if (medium == null) {
            System.out.println("No medium set. Unable to send message");
            return;
        }
        medium.send(message);
        messageLog.add(message);
    }
    /**
     * sends a notification using the given medium and logs the messages 
     * 
     * @param message, the message that is to be sent 
     */
    public void printLog() {
        System.out.println("~~~Notification Log~~~");
        for (String msg : messageLog) {
            System.out.println(msg);
        }
    }
    /**
     * prints all messages from session 
     */
    public static void main(String[] args) {
        AlertSystem system = new AlertSystem();
        system.setMedium(new EmailService());
        system.notifyUser("Welcome to the system!");
        system.notifyUser("Your password has been updated.");
        system.setMedium(new SMSService());
        system.notifyUser("Your verification code is 123456.");
        system.notifyUser("Your appointment is confirmed.");
        /**week 5 addition */
        system.setMedium(new WhatsAppService());
        system.notifyUser("This is a WhatsApp test message.");
        system.printLog();
    }
}