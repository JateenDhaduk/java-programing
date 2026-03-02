public class Saving extends Account {
    private double interestRate;
    public Saving(String personName, String accountType, String accountNo, 
                  String personAddress, String personPhoneNo, double interestRate) {
        super(personName, accountType, accountNo, personAddress, personPhoneNo);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + ". New balance: " + getBalance());
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;  
        }
        }
}