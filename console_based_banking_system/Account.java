
public abstract class Account {
    private String personName;
    private String accountType;
    private String accountNo;
    private String personAddress;
    private String personPhoneNo;
    private double balance;

    // Constructor
    /**
     * @param personName
     * @param accountType
     * @param accountNo
     * @param personAddress
     * @param personPhoneNo
     * @throws IllegalArgumentException
     */
    public Account(String personName, String accountType, String accountNo, 
                   String personAddress, String personPhoneNo) throws IllegalArgumentException {
        if(personName == null || accountType == null || accountNo == null || 
           personAddress == null || personPhoneNo == null || personName.trim().isEmpty() || accountType.trim().isEmpty() ||
           accountNo.trim().isEmpty() || personAddress.trim().isEmpty() || personPhoneNo.trim().isEmpty()) {
            throw new IllegalArgumentException("All fields must be provided.");
        }
        this.personName = personName;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.personAddress = personAddress;
        if(!personPhoneNo.matches("\\d{10}")) {
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
    public void setPersonName(String personName) throws IllegalArgumentException {
        if(personName == null || personName.trim().isEmpty()) {
            throw new IllegalArgumentException("Person name cannot be null or empty.");
        }
        this.personName = personName;
    }

    public void setAccountType(String accountType) throws IllegalArgumentException {
        if(accountType == null || accountType.trim().isEmpty()) {
            throw new IllegalArgumentException("Account type cannot be null or empty.");
        }
        this.accountType = accountType;
    }

    public void setAccountNo(String accountNo) throws IllegalArgumentException {
        if(accountNo == null || accountNo.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
        this.accountNo = accountNo;
    }

    public void setPersonAddress(String personAddress) throws IllegalArgumentException {
        if(personAddress == null || personAddress.trim().isEmpty()) {
            throw new IllegalArgumentException("Person address cannot be null or empty.");
        }
        this.personAddress = personAddress;
    }

    public void setPersonPhoneNo(String personPhoneNo) throws IllegalArgumentException {
        if(personPhoneNo == null || !personPhoneNo.matches("\\d{10}") ) {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        }
        this.personPhoneNo = personPhoneNo;
    }
    
    protected void deposit(double amount) throws IllegalArgumentException {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
    }
    public abstract void withdraw(double amount);// Abstract method to be implemented by subclasses


    // toString method for displaying account information
    @Override
    public String toString() {
        return "Account{" +
                "personName='" + personName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personPhoneNo='" + personPhoneNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}   
