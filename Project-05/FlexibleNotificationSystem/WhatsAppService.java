/**
 * @author Jacqueline Forman
 * @version 1.0
 * 
 * week 5 - addition 
 * WhatsApp service is a program implementation that uses the interface of the Notification Medium and simulates sending a message through 
 * the messaging app, WhatsApp.
 */
public class WhatsAppService implements NotificationMedium {
    @Override
    public void send(String message) {
        System.out.println(" [WhatsApp] Sending message: "+ message);
    }
}