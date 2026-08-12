import java.util.Scanner;

public class Menu {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("===== BANK ACCOUNT MANAGEMENT =====");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Account Number: ");
            int number = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Initial Deposit: ");
            double balance = scanner.nextDouble();

            bank.createAccount(number, name, balance);
        } else if (choice == 2) {
            bank.viewAllAccounts();
        } else {
            System.out.println("Thank you.");
        }
    }
}