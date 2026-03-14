// NotificationManager.java - Código a refactorizar
public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notify(String message) {
        Logger.log("Iniciando proceso de notificaion");
        
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacio");
        }
        service.send(message);
    }
}
