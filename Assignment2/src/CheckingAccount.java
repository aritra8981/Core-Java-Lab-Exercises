public class CheckingAccount extends BankAccount {
	double fee; // Variable to store the fee

	// Constructor to initialize the checking account with account number, balance, and fee
	public CheckingAccount(int accountNumber, double totalBalance, double fee) {
		super(accountNumber, totalBalance); // Call the superclass constructor to initialize account number and balance
		this.fee = fee; // Initialize the fee
	}

	// Method to deduct the fee from the account balance
	public void deductFee(double fee) {
		totalBalance -= fee; // Subtract the fee from the total balance
		System.out.println("Total Balance after fees deduction: " + totalBalance); // Display the updated balance
	}
}
