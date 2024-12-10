package solid.dip;

// Dependency Inversion Principle (DIP)
public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchases(long amount) {
        bankCard.doTransaction(amount);
    }


}
