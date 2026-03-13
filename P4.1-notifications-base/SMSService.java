public class SMSService implements NotificationService {

    @Override
    public boolean validate(String recipient) {
        return recipient != null && recipient.matches("\\d{9}");
    }

    @Override
    public void send(String message, String recipient) {
        System.out.println("[LOG] Enviando SMS a " + recipient + ": " + message);
    }
}

