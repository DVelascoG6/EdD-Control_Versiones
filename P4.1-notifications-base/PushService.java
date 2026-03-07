// PushService.java - Servicio de envío de notificaciones Push
public class PushService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (!validate(recipient)) {
            Logger.log("ERROR", "Device token inválido: " + recipient);
            throw new IllegalArgumentException("Device token no válido: " + recipient);
        }
        Logger.log("INFO", "Enviando notificación push a " + recipient);
        System.out.println("Enviando push a " + recipient + ": " + message);
        Logger.log("INFO", "Notificación push enviada correctamente a " + recipient);
    }

    @Override
    public boolean validate(String recipient) {
        // Validación: el device token no puede ser nulo ni vacío
        return recipient != null && !recipient.trim().isEmpty();
    }
}
