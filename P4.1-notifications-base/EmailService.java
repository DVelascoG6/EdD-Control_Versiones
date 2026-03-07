public class EmailService implements NotificationService
{
    @Override
    public void sendNotification(String message, String recipient)
    {
        System.out.println("\n[i] Email enviado a " + recipient + " => " + message);
    }
        
}