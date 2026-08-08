import java.util.Scanner;

public class Menu {

    private Bank bank;
    private Scanner scanner;

    public Menu(Bank bank) {
        this.bank = bank;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {

        System.out.println("\n===== ACCOUNT MANAGEMENT =====");
        System.out.println("1. Create Account");
        System.out.println("2. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                createAccount();
                break;

            case 2:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    private void createAccount() {

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        bank.createAccount(accountNumber, name);
    }
}