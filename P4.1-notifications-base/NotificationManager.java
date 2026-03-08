public class NotificationManager {

    private NotificationService strategy;

    public void setStrategy(NotificationService strategy) {
        this.strategy = strategy;
    }

    public void send(String message, String recipient)
    {
        if (strategy == null)
            throw new IllegalStateException("\n[!] Estrategia no definida!.");

            try 
            {
                strategy.sendNotification(message, recipient);
                return;
            } catch (Exception e) 
            {
                System.out.println("\n[i] Fallo al enviar la notificación."); 
            }
    }

    // NotificationManager.java - Código a refactorizar
    // TODO: Separar en clases diferentes: EmailService, SMSService, PushService
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}
