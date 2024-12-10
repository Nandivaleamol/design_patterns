package solid.isp;

// Interface Segregation Principle (ISP)
public class GooglePay implements UPIPayments, CashBackManager {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCards() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // This feature is only available on Google Pay
    }
}
