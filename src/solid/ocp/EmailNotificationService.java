package solid.ocp;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        // Write login to integrate with email api
    }

    @Override
    public void sendTransactionReport(String medium) {
        // Write a transaction report to integrate with email api
    }
}
