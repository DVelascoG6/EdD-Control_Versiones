// NotificationService.java - Interfaz principal del sistema de notificaciones
public interface NotificationService {
    /**
     * Envía una notificación al destinatario indicado.
     * @param recipient Destinatario de la notificación
     * @param message Mensaje a enviar
     */
    void send(String recipient, String message);

    /**
     * Valida si el destinatario tiene un formato correcto.
     * @param recipient Destinatario a validar
     * @return true si es válido, false en caso contrario
     */
    boolean validate(String recipient);
}
