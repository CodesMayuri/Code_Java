import java.util.Vector;

class BankAccount {
    private int accountNo;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class CP34 {
    public static void main(String[] args) {

        Vector<BankAccount> accounts = new Vector<>();

        // Adding bank accounts
        accounts.add(new BankAccount(1001, "Ramesh", 4500));
        accounts.add(new BankAccount(1002, "Suresh", 12000));
        accounts.add(new BankAccount(1003, "Mahesh", 8000));

        // Deposit amount to an account
        int depositAccNo = 1002;
        double depositAmount = 3000;

        for (BankAccount acc : accounts) {
            if (acc.getAccountNo() == depositAccNo) {
                acc.deposit(depositAmount);
                System.out.println("Deposit Successful");
                break;
            }
        }

        // Withdraw amount if balance is sufficient
        int withdrawAccNo = 1003;
        double withdrawAmount = 2000;

        for (BankAccount acc : accounts) {
            if (acc.getAccountNo() == withdrawAccNo) {
                if (acc.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            }
        }

        // Display accounts with balance < 5000
        System.out.print("Low Balance Accounts: ");
        for (BankAccount acc : accounts) {
            if (acc.getBalance() < 5000) {
                System.out.print(acc.getHolderName() + " ");
            }
        }
    }
}
