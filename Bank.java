import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }

        Account account = new Account(accountNumber, accountHolderName);
        accounts.put(accountNumber, account);

        System.out.println("Account created successfully.");
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);

            System.out.println("--------------------------------");
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Account Holder : " + account.getAccountHolderName());
            System.out.println("Current Balance: ₹" + account.getBalance());
            System.out.println("--------------------------------");
        } else {
            System.out.println("Account not found.");
        }
    }
}