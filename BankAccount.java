/**
 * This class demonstrates encapsulation: private fields, controlled access
 * through public methods, and validation logic that protects the data.
 */
public class BankAccount {
    // Private fields cannot be accessed directly from outside
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account with holder's name and initial deposit
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
            System.out.println("Initial deposit must be positive. Setting balance to 0.");
        }
    }

    // Getter for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance (no setter—direct change prevented)
    public double getBalance() {
        return balance;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method with validation on amount and sufficient funds
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Display account summary
    public void printAccountSummary() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}
