// NotificationFactory.java - Fábrica de servicios de notificación
public class NotificationFactory {

    /**
     * Devuelve el servicio de notificación correspondiente al tipo indicado.
     * @param type Tipo de notificación: "email", "sms", "push"
     * @return Implementación de NotificationService
     */
    public static NotificationService getService(String type) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de notificación no puede ser nulo");
        }
        switch (type.toLowerCase()) {
            case "email":
                return new EmailService();
            case "sms":
                return new SMSService();
            case "push":
                return new PushService();
            default:
                Logger.log("ERROR", "Tipo de notificación desconocido: " + type);
                throw new IllegalArgumentException("Tipo de notificación no soportado: " + type);
        }
    }
}
