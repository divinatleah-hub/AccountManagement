import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public boolean createAccount(int id, String name, double balance) {

        for (Account account : accounts) {
            if (account.getAccountId() == id) {
                return false;
            }
        }

        accounts.add(new Account(id, name, balance));
        return true;
    }

    public Account searchAccount(int id) {

        for (Account account : accounts) {
            if (account.getAccountId() == id) {
                return account;
            }
        }

        return null;
    }

    public boolean deposit(int id, double amount) {

        Account account = searchAccount(id);

        if (account != null) {
            account.deposit(amount);
            return true;
        }

        return false;
    }

    public boolean withdraw(int id, double amount) {

        Account account = searchAccount(id);

        if (account != null) {
            return account.withdraw(amount);
        }

        return false;
    }

    public void checkBalance(int id) {

        Account account = searchAccount(id);

        if (account != null) {
            System.out.println("\nAccount ID : " + account.getAccountId());
            System.out.println("Name       : " + account.getName());
            System.out.println("Balance    : " + account.getBalance());
        } else {
            System.out.println("Account Not Found.");
        }
    }
}