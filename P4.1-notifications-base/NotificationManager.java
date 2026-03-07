public class NotificationManager {

    private NotificationService emailService;
    private NotificationService smsService;
    private NotificationService pushService;

    public NotificationManager() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
        this.pushService = new PushService();
    }

    public void sendNotification(String type, String recipient, String message) {
        switch (type.toLowerCase()) {
            case "email":
                emailService.send(recipient, message);
                break;
            case "sms":
                smsService.send(recipient, message);
                break;
            case "push":
                pushService.send(recipient, message);
                break;
            default:
                System.out.println("Tipo de notificación no reconocido: " + type);
        }
    }
}