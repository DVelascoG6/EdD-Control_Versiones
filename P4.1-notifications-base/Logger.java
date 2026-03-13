// Logger.java - Sistema de logs del sistema de notificaciones
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Registra un mensaje con nivel y timestamp.
     * @param level Nivel del log: INFO, WARN, ERROR
     * @param message Mensaje a registrar
     */
    public static void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("[" + timestamp + "] [" + level + "] " + message);
    }
}
