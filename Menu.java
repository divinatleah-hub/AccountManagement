import java.util.Scanner;

public class Menu {

    private Bank bank;
    private Scanner scanner;

    public Menu(Bank bank) {
        this.bank = bank;
        scanner = new Scanner(System.in);
    }

    public void showMenu() {

        int choice;

        do {
            System.out.println();
            System.out.println("================================");
            System.out.println("       BANK MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String accountHolderName = scanner.nextLine();

                    bank.createAccount(accountNumber, accountHolderName);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depositAccount = scanner.nextLine();

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();

                    bank.deposit(depositAccount, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String withdrawAccount = scanner.nextLine();

                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    bank.withdraw(withdrawAccount, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String balanceAccount = scanner.nextLine();

                    bank.checkBalance(balanceAccount);
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);
    }
}