public class NotificationFactory {

    public static NotificationService create(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Tipo de notificación nulo");
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailService();
            case "sms":
                return new SMSService();
            case "push":
                return new PushService();
            default:
                throw new IllegalArgumentException("Tipo de notificación no válido: " + type);
        }
    }
}
