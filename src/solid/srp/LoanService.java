package solid.srp;

// Single Responsibility Principle (SRP)
// Manage the Loan services
public class LoanService {
    public void getLoanInterestInfo(String loanType){
        if (loanType.equals("homeLoan")){
            // do something
        }else if (loanType.equals("personalLoan")){
            // do something
        }else if (loanType.equals("carLoan")){
            // do something
        }
    }

}
