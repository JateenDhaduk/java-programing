import java.util.regex.Pattern;

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
        if(!personPhoneNo.matches("\\d{10}")  || personPhoneNo == null) {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        }
        this.personPhoneNo = personPhoneNo;
    }

    public void setBalance(double balance) throws IllegalArgumentException {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public abstract void withdraw(double amount);
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
