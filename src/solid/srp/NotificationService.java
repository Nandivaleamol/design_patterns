package solid.srp;

// Single Responsibility Principle (SRP): Manage the notification services
public class NotificationService {

    public void sendEmail(String recipient, String subject, String body) {
        // Implementation to send an email using an SMTP server
    }
    public void sendOTP(String medium, String recipient, String subject, String body){
        // Implementation to send an OTP using an SMS service
        // Example: Twilio or SMS Gateway
        if (medium.equals("mobile")){
            // Implement sending SMS using Twilio or other SMS service
        }
        if (medium.equals("email")){
            // Implement sending email using SMTP server
        }
    }
}
