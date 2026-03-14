public class NotificationFactory {
    private enum TipoNotificacion {
        EMAIL,
        SMS,
        PUSH;
    }

    public static NotificationService create(String tipo)
    {
        if (tipo == null)
            throw new IllegalArgumentException("\n[!] tipo es null!");
        
        if (tipo.trim().isEmpty())
            throw new IllegalArgumentException("\n[!] tipo está vacío");

        // Limpio input
        tipo = tipo.toUpperCase().trim();
        TipoNotificacion tipoEnum;

        try 
        {
            tipoEnum = TipoNotificacion.valueOf(tipo);
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException("\n[!] Tipo no soportado: " + tipo);
        }

        // Llegados aquí, lo soportamos
        switch (tipoEnum) 
        {
            case EMAIL: return new EmailService();
            case SMS:   return new SMSService();
            case PUSH:  return new PushService();
            default:
                throw new IllegalArgumentException("\n[!] Tipo no soportado: " + tipo);
        }
    }
}
