import java.util.ArrayList;
import java.util.List;
public class Bank {
    private String bankName;
    private String bankAddress;
    private List<Account> accounts;
    public Bank(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.accounts = new ArrayList<>();
    }
   
    // Getters
    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }
    // Setters
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public void addAccount(Account account) {
        for(Account acc : accounts){
            if(acc.getAccountNo().equals(account.getAccountNo())){
                System.out.println("Account with this number already exists.");
                return;
            }
        }

        accounts.add(account);
    }
    public void displayAccounts(){
        for(Account acc : accounts){
            System.out.println(acc.toString());
        }
    }
    public Account findAccountByNumber(String accountNo) throws IllegalArgumentException {
        checkAccoutNoValidation(accountNo);
        for (Account acc : accounts) {
            if (acc.getAccountNo().equals(accountNo)) {
                return acc;
            }
        }
        return null;
    }
    public void removeAccount(String accountNo) throws IllegalArgumentException {
        checkAccoutNoValidation(accountNo);
        Account acc = findAccountByNumber(accountNo);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
    public void checkAccoutNoValidation(String accountNo) throws IllegalArgumentException {
        if(accountNo == null || accountNo.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
    }

    public void depositToAccount(String AccountNo , Double amount) throws IllegalArgumentException{
        checkAccoutNoValidation(AccountNo);
        Account acc = findAccountByNumber(AccountNo);
        
        if(acc != null){
            acc.deposit(amount);
            System.out.println("Successfully deposited " + amount + " New balance: " + acc.getBalance());
        }   
        else{
            System.out.println("Account not found.");
        }
    }

    public void withdrawFromAccount(String AccountNo , Double amount) throws IllegalArgumentException{
        checkAccoutNoValidation(AccountNo);
        Account acc = findAccountByNumber(AccountNo);

        if(acc != null){
            try {
                acc.withdraw(amount);
                System.out.println("Successfully withdrawn " + amount + " New balance: " + acc.getBalance());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }   
        else{
            System.out.println("Account not found.");
        }
    } 
}