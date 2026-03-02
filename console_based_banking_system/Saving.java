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
    public boolean withdraw(double amount) throws IllegalArgumentException {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + ". New balance: " + getBalance());
            return true;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount or insufficient balance.");
        }
        }
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: " + interest + ". New balance: " + getBalance()); 
    }
}