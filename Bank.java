import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int accNo, String name, double balance) {

        if (accounts.containsKey(accNo)) {
            System.out.println("Account Already Exists");
            return;
        }

        accounts.put(accNo, new Account(accNo, name, balance));
        System.out.println("Account Created Successfully");
    }

    public void deposit(int accNo, double amount) {

        Account a = accounts.get(accNo);

        if (a != null) {
            a.deposit(amount);
            System.out.println("Amount Deposited");
        } else {
            System.out.println("Account Not Found");
        }
    }

    public void withdraw(int accNo, double amount) {

        Account a = accounts.get(accNo);

        if (a != null)
            a.withdraw(amount);
        else
            System.out.println("Account Not Found");
    }

    public void balance(int accNo) {

        Account a = accounts.get(accNo);

        if (a != null)
            System.out.println("Balance : " + a.getBalance());
        else
            System.out.println("Account Not Found");
    }
}