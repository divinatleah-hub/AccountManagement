
import java.util.Scanner;

public class Menu {

    public void start() {

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        while (true) {

            System.out.println("\n1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Balance Check");
            System.out.println("5.Exit");

            System.out.print("Enter Choice : ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Account No : ");
                    int acc = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Opening Balance : ");
                    double bal = sc.nextDouble();

                    bank.createAccount(acc, name, bal);
                    break;

                case 2:
                    System.out.print("Account No : ");
                    acc = sc.nextInt();

                    System.out.print("Amount : ");
                    double amt = sc.nextDouble();

                    bank.deposit(acc, amt);
                    break;

                case 3:
                    System.out.print("Account No : ");
                    acc = sc.nextInt();

                    System.out.print("Amount : ");
                    amt = sc.nextDouble();

                    bank.withdraw(acc, amt);
                    break;

                case 4:
                    System.out.print("Account No : ");
                    acc = sc.nextInt();

                    bank.balance(acc);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}