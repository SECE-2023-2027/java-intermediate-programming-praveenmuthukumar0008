class BankAccount {
    // Private fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
        }
    }

    // Getter Methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC123", "John", 500.0);

        account.deposit(200);

        account.withdraw(800);

        System.out.println(account.getBalance());
    }
}