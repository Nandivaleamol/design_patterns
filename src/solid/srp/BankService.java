package solid.srp;

// Single Responsibility Principle (SRP): Manages the bank services
public class BankService {

    public String deposit(long amount, String accountNo){
        // deposit amount
        return accountNo + " deposited: " + amount;
    }

    public String withdraw(long amount, String accountNo){
        // withdraw amount
        return accountNo + " withdraw: " + amount;
    }
}
