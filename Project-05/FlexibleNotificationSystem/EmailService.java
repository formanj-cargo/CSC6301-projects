/**
 * @author Jacqueline Forman 
 * 
 * A notification medium that sends notifications over email
 */
public class EmailService implements NotificationMedium {
    @Override
    public void send(String message) {
        System.out.println("[email]"+message);
    }
    /**
     * sends the message as an email 
     * 
     * @param message, the message to be sent 
     */
}