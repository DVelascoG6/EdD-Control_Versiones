public class PushService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("Enviando notificación push a " + recipient + ": " + message);
        }
    }

    @Override
    public boolean validate(String recipient) {
        return recipient != null && !recipient.isEmpty();
    }
}