import java.util.LinkedHashMap;

public class Bank {
    private LinkedHashMap<Integer, Account> accounts = new LinkedHashMap<>();

    public void createAccount(int accountNumber, String accountHolder, double balance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }

        Account account = new Account(accountNumber, accountHolder, balance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);

        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
        } else if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);

        if (account != null) {
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void viewAllAccounts() {
        for (Account account : accounts.values()) {
            System.out.println(
                account.getAccountNumber() + " - " +
                account.getAccountHolder() + " - ₹" +
                account.getBalance()
            );
        }
    }
}