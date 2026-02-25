/**
 * A notification medium that sends notifications over text (SMS).
 *
 * @author Jacqueline Forman
 */
public class SMSService implements NotificationMedium {
    /**
     * Sends the message as a text message (SMS).
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("[sms]" + message);
    }
}
