// Main.java - Programa principal actualizado
public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();

        // Envíos individuales
        manager.send("email", "Bienvenido al sistema", "usuario@email.com");
        manager.send("sms", "Tu código es 1234", "+34123456789");
        manager.send("push", "Tienes un nuevo mensaje", "user_device_001");

        // Envío a múltiples destinatarios
        manager.sendToMultiple("email", "Mantenimiento programado",
                "admin@email.com", "soporte@email.com");
    }
}
