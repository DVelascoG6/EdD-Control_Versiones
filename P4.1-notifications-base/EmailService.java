public class EmailService implements NotificationService{
    @Override
    public void send(String message) {
        Logger.log("Preparando envio de Email");
        System.out.println("Enviando Email: " + message);
        Logger.log("Email enviado correctamente");
    }
}
