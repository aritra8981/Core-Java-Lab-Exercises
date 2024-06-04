public class BankAccount {
	int accountNumber;  // Variable to store the account number
	double totalBalance;  // Variable to store the total balance

	// Constructor to initialize the account number and total balance
	public BankAccount(int accountNumber, double totalBalance) {
		this.accountNumber = accountNumber;  // Initialize account number
		this.totalBalance = totalBalance;  // Initialize total balance
	}

	// Method to deposit an amount into the account
	public double deposit(double depositAmount) {
		// Check if the deposit amount is greater than zero
		if (depositAmount > 0) {
			totalBalance += depositAmount;  // Add the deposit amount to the total balance
			System.out.println("Rs. " + depositAmount + " Deposited Successfully. Current Balance Rs. " + totalBalance);
		}
		return totalBalance;  // Return the updated balance
	}

	// Method to withdraw an amount from the account
	public double withdraw(double withdrawAmount) {
		// Check if the withdraw amount is greater than zero and does not exceed the total balance
		if (withdrawAmount > 0 && withdrawAmount <= totalBalance) {
			totalBalance -= withdrawAmount;  // Subtract the withdraw amount from the total balance
			System.out.println(withdrawAmount + " Withdrawn Successfully. Current Balance: " + totalBalance);
		} else {
			// Print an error message if the balance is insufficient
			System.out.println("Insufficient Balance.");
		}
		return totalBalance;  // Return the updated balance
	}

	// Method to get the current balance
	public void getBalance() {
		System.out.println("Your Current Balance is: " + totalBalance);  // Print the current balance
	}
}
