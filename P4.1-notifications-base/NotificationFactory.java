public class NotificationFactory {
    public static NotificationService create(String type) {
        switch (type) {
            case "email": return new EmailService();
            case "sms": return new SMSService();
            case "push": return new PushService();
            default: throw new IllegalArgumentException("Tipo no valido");
        }
    }
}
