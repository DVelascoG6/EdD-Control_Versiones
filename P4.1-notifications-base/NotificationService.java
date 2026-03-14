public interface NotificationService {
/**
 * Envía notificación al destinatario
 * 
 * @param message     El contenido del mensaje a enviar
 * @param recipient   El destinatario (email, teléfono, push...)
 */

    void sendNotification(String message, String recipient);
}

