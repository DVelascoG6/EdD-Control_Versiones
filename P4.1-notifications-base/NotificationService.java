public interface NotificationService {
    void send(String recipient, String message);
    boolean validate(String recipient);
}