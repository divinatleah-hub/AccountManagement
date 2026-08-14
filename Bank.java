import java.util.LinkedHashMap;

public class Bank {
    private LinkedHashMap<Integer, Account> accounts;

    public Bank() {
        accounts = new LinkedHashMap<>();
    }

    public void createAccount(int accountNumber, String accountHolder, double initialDeposit) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }

        if (initialDeposit < 0) {
            System.out.println("Invalid initial deposit.");
            return;
        }

        Account account = new Account(
            accountNumber,
            accountHolder,
            initialDeposit
        );

        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        account.deposit(amount);
        System.out.println("Amount deposited successfully.");
        System.out.println("Balance: ₹" + account.getBalance());
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Amount withdrawn successfully.");
            System.out.println("Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: ₹" + account.getBalance());
    }

    public void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n--- All Accounts ---");

        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}