import java.util.Scanner;

public class Menu {

    private Bank bank;
    private Scanner scanner;

    public Menu() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }

    public void display() {

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. View Sorted Ledger");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();

                    bank.createAccount(id, name, balance);
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    id = scanner.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = scanner.nextDouble();

                    bank.deposit(id, deposit);
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    id = scanner.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = scanner.nextDouble();

                    bank.withdraw(id, withdraw);
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    id = scanner.nextInt();

                    bank.checkBalance(id);
                    break;

                case 5:
                    bank.displaySortedLedger();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}