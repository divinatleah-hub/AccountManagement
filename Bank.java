import java.util.LinkedHashMap;

public class Bank {
    private LinkedHashMap<Integer, Account> accounts = new LinkedHashMap<>();

    public void createAccount(int accountNumber, String accountHolder, double balance) {
        Account account = new Account(accountNumber, accountHolder, balance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public void viewAllAccounts() {
        for (Account account : accounts.values()) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: ₹" + account.getBalance());
        }
    }
}