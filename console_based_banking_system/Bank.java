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
    public void addAccount(Acount account) {
        for(Account acc : accounts){
            if(acc.getAccountNo().equals(account.getAccountNo())){
                System.out.println("Account with this number already exists.");
                return;
            }
        }

        accounts.add(account);
    }
    

    // Setters
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }
}