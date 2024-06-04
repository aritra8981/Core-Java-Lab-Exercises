public class BankAccountFundsChecker {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000.0); // Create a checking account with an initial balance of $1000

        try {
            // Attempt to withdraw $500
            account.withdraw(500.0);
            // Attempt to withdraw $700 (insufficient funds)
            account.withdraw(700.0);
        } catch (InsufficientFundsException e) {
            // Catch and handle the InsufficientFundsException
            System.out.println("Error: " + e.getMessage());
        }

        // Print the current balance after withdrawal attempts
        System.out.println("Current balance: " + account.getBalance());
    }
}
