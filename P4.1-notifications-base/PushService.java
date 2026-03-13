public class PushService implements NotificationService {

    @Override
    public boolean validate(String recipient) {
        return recipient != null && !recipient.isEmpty();
    }

    @Override
    public void send(String message, String recipient) {
        System.out.println("[LOG] Enviando notificación push a " + recipient + ": " + message);
    }
}

