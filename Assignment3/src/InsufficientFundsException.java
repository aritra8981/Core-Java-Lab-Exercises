// Custom exception class for handling insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// CheckingAccount class representing a bank account
class CheckingAccount {
    private double balance; // The current balance of the account

    // Constructor to initialize the account with an initial balance
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        // Check if the withdrawal amount exceeds the balance
        if (amount > balance) {
            // Throw an InsufficientFundsException if there are not enough funds
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        // Deduct the amount from the balance if sufficient funds are available
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
