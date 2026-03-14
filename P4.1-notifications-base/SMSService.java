public class SMSService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("Enviando SMS a " + recipient + ": " + message);
        }
    }

    @Override
    public boolean validate(String recipient) {
        return recipient != null && recipient.matches("\\+?[0-9]{9,15}");
    }
}