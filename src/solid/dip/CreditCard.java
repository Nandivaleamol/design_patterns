package solid.dip;

// Dependency Inversion Principle (DIP)
public class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amount){
        System.out.println("Payment using credit card " + amount);
    }
}
