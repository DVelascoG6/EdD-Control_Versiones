public class EmailService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("Enviando email a " + recipient + ": " + message);
        }
    }

    @Override
    public boolean validate(String recipient) {
        return recipient != null && recipient.contains("@");
    }
}