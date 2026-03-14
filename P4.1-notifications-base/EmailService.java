public class EmailService implements NotificationService {

    @Override
    public boolean validate(String recipient) {
        return recipient != null && recipient.contains("@") && recipient.contains(".");
    }

    @Override
    public void send(String message, String recipient) {
        System.out.println("[LOG] Enviando email a " + recipient + ": " + message);
    }
}

