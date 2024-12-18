package strategy;

public class PaymentTest {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.pay(100.0);

        context = new PaymentContext(new DebitCardPayment());
        context.pay(500.00);

        context = new PaymentContext(new CreditCardPayment());
        context.pay(200.0);

        context = new PaymentContext(new BankToTransfer());
        context.pay(300.0);
    }
}
