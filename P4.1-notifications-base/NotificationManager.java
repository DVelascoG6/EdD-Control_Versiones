public class NotificationManager {

    private NotificationService strategy;
    private final int MAX_RETRIES = 3;

    public void setStrategy(NotificationService strategy) {
        this.strategy = strategy;
    }

    public void send(String message, String recipient)
    {
        if (strategy == null)
            throw new IllegalStateException("\n[LOG] Estrategia no definida!.");

        int attempts = 0;
        validate(message, recipient);

        while (attempts < MAX_RETRIES)
        {
            attempts++;
            try 
            {
                strategy.sendNotification(message, recipient);
                return;
            } catch (Exception e) 
            {
                System.out.println("\n[LOG] Fallo al enviar la notificación. Intento: " + attempts + ". Error: " + e.getMessage());  
                
                // Practica básica, no implemento delay para rate-limit
                // Si ya agotamos los 3 intentos
                if (attempts == MAX_RETRIES)
                    throw new RuntimeException("\n[LOG] No se pudo enviar la notificación después de " + MAX_RETRIES + " intentos");
            }
        }
    }

    private void validate(String message, String recipient) {
    if (message == null) throw new IllegalArgumentException("\n[!] Mensaje null!!.");
    if (recipient == null) throw new IllegalArgumentException("\n[!] Destinatario null!!.");
    if (message.trim().isEmpty()) throw new IllegalArgumentException("\n[!] Mensaje vacío!!.");
    if (recipient.trim().isEmpty()) throw new IllegalArgumentException("\n[!] Destinatario vacío!!.");
}

    // NotificationManager.java - Código a refactorizar
    // TODO: Separar en clases diferentes: EmailService, SMSService, PushService
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}
