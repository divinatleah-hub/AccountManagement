import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Bank bank = new Bank();

    public void start() {

        int choice;

        do {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    if (bank.createAccount(id, name, balance)) {
                        System.out.println("Account Created Successfully.");
                    } else {
                        System.out.println("Account ID Already Exists.");
                    }

                    break;

                case 2:

                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();

                    if (bank.deposit(id, deposit)) {
                        System.out.println("Amount Deposited Successfully.");
                    } else {
                        System.out.println("Account Not Found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    if (bank.withdraw(id, withdraw)) {
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Insufficient Balance or Account Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    bank.checkBalance(id);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

    }
}