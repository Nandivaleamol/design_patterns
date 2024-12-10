package solid.dip;

// Dependency Inversion Principle (DIP)
public class App {
    public static void main(String[] args) {
        BankCard debitCard = new DebitCard();
        BankCard creditCard = new CreditCard();
        ShoppingMall mall = new ShoppingMall(creditCard);
        mall.doPurchases(100); // No need to change the implementation of DebitCard when we change the ShoppingMall class.
    }
}
