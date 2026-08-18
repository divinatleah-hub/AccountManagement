import java.util.TreeMap;
import java.util.Comparator;

public class Bank {

    private TreeMap<Integer, Account> accounts;

    public Bank() {

        // Natural sorting by Account ID
        accounts = new TreeMap<>(Comparator.naturalOrder());
    }

    // Create Account
    public void createAccount(int id, String name, double balance) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists!");
            return;
        }

        Account account = new Account(id, name, balance);
        accounts.put(id, account);

        System.out.println("Account created successfully!");
    }

    // Find Account
    public Account findAccount(int id) {
        return accounts.get(id);
    }

    // Deposit
    public void deposit(int id, double amount) {

        Account account = findAccount(id);

        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public void withdraw(int id, double amount) {

        Account account = findAccount(id);

        if (account != null) {

            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance!");
            }

        } else {
            System.out.println("Account not found!");
        }
    }

    // Balance Check
    public void checkBalance(int id) {

        Account account = findAccount(id);

        if (account != null) {
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Name: " + account.getName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
}