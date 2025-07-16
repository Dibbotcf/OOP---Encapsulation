public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("Rashid", 1000);

        // Display initial account summary
        account.printAccountSummary();

        // Deposit and withdraw operations
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000); // Insufficient funds
        account.deposit(-50);   // Invalid deposit

        // Display updated account summary
        account.printAccountSummary();
    }
}
