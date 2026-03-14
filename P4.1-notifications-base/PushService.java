public class PushService implements NotificationService {
    
    @Override
    public void sendNotification(String message, String recipient)
    {
        System.out.println("\n[i] Push enviado a " + recipient + " => " + message);
    }
}
