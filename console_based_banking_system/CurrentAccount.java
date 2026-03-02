public class CurrentAccount extends Account {
    private final double overdraftLimit = -10000; // Overdraft limit of 10,000
    public CurrentAccount(String personName , String accountType , String accountNo , String personAddress , String personPhoneNo){
        super(personName , accountType , accountNo , personAddress , personPhoneNo);
    }

    @Override
    public boolean withdraw(double amount) throws IllegalArgumentException {
        if (amount > 0 && overdraftLimit <= (getBalance() - amount)) {
            setBalance(getBalance() - amount); 
            return true;    
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount or overdraft limit exceeded.");
        }
    }
}    