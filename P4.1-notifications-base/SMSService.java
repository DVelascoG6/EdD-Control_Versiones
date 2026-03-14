public class SMSService implements NotificationService {
    
    @Override
    public void sendNotification(String message, String recipient)
    {
        System.out.println("\n[i] SMS enviado a " + recipient + " => " + message);
    }
}
