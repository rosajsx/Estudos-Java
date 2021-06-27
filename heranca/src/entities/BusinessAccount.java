package entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        // Reaproveitando o construtor da classe pai(super), ou seja chama o construtor da super classe.
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimite) {
        this.loanLimit = loanLimite;
    }

    public void loan(double amount){
        if(amount <= loanLimit) {
           // deposit(amount - 10.0);

            balance += amount - 10;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance-= 2.0;
    }
}
