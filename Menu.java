import java.util.Scanner;

public class Menu {
    private Bank bank = new Bank();
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    bank.viewAllAccounts();
                    break;
                case 6:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    private void createAccount() {
        System.out.print("Enter Account Number: ");
        int number = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double balance = scanner.nextDouble();

        bank.createAccount(number, name, balance);
    }

    private void deposit() {
        System.out.print("Enter Account Number: ");
        int number = scanner.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        bank.deposit(number, amount);
    }

    private void withdraw() {
        System.out.print("Enter Account Number: ");
        int number = scanner.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        bank.withdraw(number, amount);
    }

    private void checkBalance() {
        System.out.print("Enter Account Number: ");
        int number = scanner.nextInt();

        bank.checkBalance(number);
    }
}