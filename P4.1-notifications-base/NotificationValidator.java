public class NotificationValidator {

    public boolean validateEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public boolean validatePhone(String phone) {
        return phone != null && phone.matches("\\+?[0-9]{9,15}");
    }

    public boolean validateDeviceToken(String token) {
        return token != null && !token.isEmpty();
    }

    public boolean validateMessage(String message) {
        return message != null && !message.isEmpty() && message.length() <= 500;
    }
}