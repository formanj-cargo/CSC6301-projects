/**
 * @author Jacqueline Forman
 * @version 1.0
 * 
 * Represents way in which notificaitons can be sent out 
 */
public interface NotificationMedium {
    void send(String message);
    /**
     * sends notifications
     * @param message, the message to be sent 
     */
}
