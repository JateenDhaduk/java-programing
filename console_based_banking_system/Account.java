public abstract class Account {
    private String personName;
    private String accountType;
    private String accountNo;
    private String personAddress;
    private String personPhoneNo;
    private double balance;

    // Constructor
    public Account(String personName, String accountType, String accountNo, 
                   String personAddress, String personPhoneNo) {
        this.personName = personName;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.personAddress = personAddress;
        this.personPhoneNo = personPhoneNo;
    }

    // Getters
    public String getPersonName() {
        return personName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public String getPersonPhoneNo() {
        return personPhoneNo;
    }
    
    public double getBalance() {
        return balance;
    }


    // Setters
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public void setPersonPhoneNo(String personPhoneNo) {
        this.personPhoneNo = personPhoneNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);
}   
