package solid.ocp;

// Open-Closed Principle (OCP)
public interface NotificationService {

    void sendOTP(String medium);
    void sendTransactionReport(String medium);
}
