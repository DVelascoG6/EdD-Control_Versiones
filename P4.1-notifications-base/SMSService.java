public class SMSService implements NotificationService{
    @Override
    public void send(String message) {
        Logger.log("Preparando envio de SMS");
        System.out.println("Enviando SMS: " + message);
        Logger.log("SMS enviado correctamente");
    }
}
