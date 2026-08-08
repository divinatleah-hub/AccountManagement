import java.util.HashMap;

public class Bank {

    private HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accountNumber, String name) {

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
            return;
        }

        Account account = new Account(accountNumber, name);
        accounts.put(accountNumber, account);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
    }
}