public class Account {
	int accNo;  // Variable to store account number
	String accName;  // Variable to store account holder's name
	double amount;  // Variable to store account balance

	// Constructor to initialize the account details
	public Account(int accNo, String accName, double amount) {
		this.accNo = accNo;  // Initialize account number
		this.accName = accName;  // Initialize account holder's name
		this.amount = amount;  // Initialize account balance
	}

	// Method to withdraw an amount from the account
	public void withdraw(double withdrawAmount) {
		// Check if the withdraw amount is valid and sufficient balance is available
		if (withdrawAmount > 0 && withdrawAmount <= amount) {
			amount -= withdrawAmount;  // Deduct the withdraw amount from the balance
			System.out.println("Withdrawal Successful. Remaining Balance: Rs. " + amount);
		} else {
			// Print an error message if the withdraw amount is invalid or insufficient balance
			System.out.println("Withdrawal failed! Insufficient Balance.");
		}
	}

	// Method to deposit an amount into the account
	public void deposit(double depositAmount) {
		// Check if the deposit amount is valid
		if (depositAmount > 0) {
			amount += depositAmount;  // Add the deposit amount to the balance
			System.out.println(depositAmount + " Deposited Successfully! Updated Balance: Rs. " + amount);
		} else {
			// Print an error message if the deposit amount is invalid
			System.out.println("Invalid Amount.");
		}
	}

	// Method to calculate the interest earned on the account balance
	public void calculateInterest(double rate) {
		double interest = (amount * rate) / 100;  // Calculate interest based on the rate
		System.out.println("Interest Earned: " + interest);  // Print the interest earned
	}
}
