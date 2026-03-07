// EmailService.java - Servicio de envío de emails
public class EmailService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (!validate(recipient)) {
            Logger.log("ERROR", "Email inválido: " + recipient);
            throw new IllegalArgumentException("Dirección de email no válida: " + recipient);
        }
        Logger.log("INFO", "Enviando email a " + recipient);
        System.out.println("Enviando email a " + recipient + ": " + message);
        Logger.log("INFO", "Email enviado correctamente a " + recipient);
    }

    @Override
    public boolean validate(String recipient) {
        // Validación básica: debe contener @ y un dominio con punto
        return recipient != null && recipient.matches("^[\\w._%+\\-]+@[\\w.\\-]+\\.[a-zA-Z]{2,}$");
    }
}
