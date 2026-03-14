public class PushService implements NotificationService{
    public void send(String message) {
        Logger.log("Preparando envio de Push service");
        System.out.println("Enviando Push Serivce: " + message);
        Logger.log("Push Service enviado correctamente");
    }
}
