package strategy;

public class BankToTransfer implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying using bank transfer " + amount);
    }
}
