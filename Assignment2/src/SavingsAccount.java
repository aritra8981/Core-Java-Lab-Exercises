public class SavingsAccount extends BankAccount {
	double interestRate; // Variable to store the interest rate

	// Constructor to initialize the savings account with account number, balance, and interest rate
	public SavingsAccount(int accountNumber, double totalBalance, double interestRate) {
		super(accountNumber, totalBalance); // Call the superclass constructor to initialize account number and balance
		this.interestRate = interestRate; // Initialize the interest rate
	}

	// Method to add interest to the account balance
	public double addInterest(double interestRate) {
		// Calculate the total interest earned
		double totalInterest = (totalBalance * interestRate * 1) / 100;
		System.out.println("Interest earned: Rs. " + totalInterest); // Display the interest earned

		// Add the earned interest to the total balance
		totalBalance += totalInterest;
		// Return the updated balance
		return totalBalance;
	}
}
