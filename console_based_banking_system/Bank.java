public class Bank {
    private String bankName;
    private String bankAddress;
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
}