import java.time.LocalDateTime;

public class NotificationLogger {

    public void log(String type, String recipient, String status) {
        System.out.println("[" + LocalDateTime.now() + "] " +
            "Tipo: " + type + " | " +
            "Destinatario: " + recipient + " | " +
            "Estado: " + status);
    }
}