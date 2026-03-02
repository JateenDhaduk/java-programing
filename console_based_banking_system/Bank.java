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
    public Account findAccountByNumber(String accountNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNo().equals(accountNo)) {
                return acc;
            }
        }
        return null;
    }
    // Setters
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }
}