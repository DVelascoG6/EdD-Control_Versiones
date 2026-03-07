// SMSService.java - Servicio de envío de SMS
public class SMSService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        if (!validate(recipient)) {
            Logger.log("ERROR", "Número de teléfono inválido: " + recipient);
            throw new IllegalArgumentException("Número de teléfono no válido: " + recipient);
        }
        Logger.log("INFO", "Enviando SMS a " + recipient);
        System.out.println("Enviando SMS a " + recipient + ": " + message);
        Logger.log("INFO", "SMS enviado correctamente a " + recipient);
    }

    @Override
    public boolean validate(String recipient) {
        // Validación: número internacional con + y entre 7 y 15 dígitos
        return recipient != null && recipient.matches("^\\+[1-9]\\d{6,14}$");
    }
}
