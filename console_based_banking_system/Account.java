public abstract class Account {
    private String personName;
    private String accountType;
    private String accountNo;
    private String personAddress;
    private String personPhoneNo;
    private double balance;

    // Constructor
    public Account(String personName, String accountType, String accountNo, 
                   String personAddress, String personPhoneNo) throws IllegalArgumentException {
        if(personName == null || accountType == null || accountNo == null || 
           personAddress == null || personPhoneNo == null) {
            throw new IllegalArgumentException("All fields must be provided.");
        }
        this.personName = personName;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.personAddress = personAddress;
        if(!personPhoneNo.matches("\\d{10}") {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        }
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
