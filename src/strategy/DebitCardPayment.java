package strategy;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount+ " using debit card");
    }
}
