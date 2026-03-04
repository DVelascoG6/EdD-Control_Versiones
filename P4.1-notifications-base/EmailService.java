public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Envio email: " + message);
    }
}
