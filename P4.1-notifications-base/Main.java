// Main.java - Programa principal
public class Main {
    public static void main(String[] args) {

        // Email
        NotificationManager emailManager = new NotificationManager(NotificationFactory.create("email"));
        emailManager.notify("Bienvenido al sistema");

        // SMS
        NotificationManager smsManager = new NotificationManager(NotificationFactory.create("sms"));
        smsManager.notify("Tu código es 1234");

        // Push
        NotificationManager pushManager = new NotificationManager(NotificationFactory.create("push"));
        pushManager.notify("Tienes un nuevo mensaje");
    }
}
