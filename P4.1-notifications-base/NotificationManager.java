// NotificationManager.java - Gestor refactorizado de notificaciones
public class NotificationManager {

    /**
     * Envía una notificación usando el servicio adecuado según el tipo.
     * @param type    Tipo de notificación: "email", "sms", "push"
     * @param message Mensaje a enviar
     * @param recipient Destinatario
     */
    public void send(String type, String message, String recipient) {
        Logger.log("INFO", "Iniciando envío de notificación tipo: " + type);
        NotificationService service = NotificationFactory.getService(type);
        service.send(recipient, message);
    }

    /**
     * Envía una notificación a múltiples destinatarios.
     * @param type       Tipo de notificación
     * @param message    Mensaje a enviar
     * @param recipients Lista de destinatarios
     */
    public void sendToMultiple(String type, String message, String... recipients) {
        for (String recipient : recipients) {
            send(type, message, recipient);
        }
    }
}
