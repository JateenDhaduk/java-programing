import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank", "123 Main St");
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Find Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter person name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter person address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter person phone number: ");
                    String phoneNo = sc.nextLine();

                    if(type.equalsIgnoreCase("Saving")) {
                        System.out.print("Enter interest rate: ");
                        double interestRate = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        bank.addAccount(new Saving(name, type, accNo, address, phoneNo, interestRate));
                    } else if(type.equalsIgnoreCase("Current")) {
                        bank.addAccount(new CurrentAccount(name, type, accNo, address, phoneNo));
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;
                case 2:
                    bank.displayAccounts();
                    break;
                case 3:
                    System.out.print("Enter account number to find: ");
                    String searchAccNo = sc.nextLine();
                    Account foundAccount = bank.findAccountByNumber(searchAccNo);
                    if(foundAccount != null) {
                        System.out.println(foundAccount.toString());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to remove: ");
                    String removeAccNo = sc.nextLine();
                    bank.removeAccount(removeAccNo);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }   
        }
    }
}
