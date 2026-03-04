public class PushService implements NotificationService{
    public void send(String message) {
        System.out.println("Enviando push: " + message);
    }
}
