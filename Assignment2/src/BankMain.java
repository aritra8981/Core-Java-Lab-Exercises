import java.util.Scanner; // Import the Scanner class for taking user input

public class BankMain {

	public static void main(String[] args) {
		int accNo = 0; // Variable to store account number
		double totalBalance; // Variable to store total balance
		double fees = 0; // Variable to store fees
		double interestRate = 0; // Variable to store interest rate
		
		Scanner s = new Scanner(System.in); // Create a Scanner object for input
		
		// Prompt and read account details
		System.out.println("Enter the Account Details Below: ");
		System.out.println("Enter Account Number: ");
		accNo = s.nextInt();
		
		System.out.println("Enter Total Balance: ");
		totalBalance = s.nextDouble();
	
		// Create a BankAccount object with the provided account number and balance
		BankAccount ba = new BankAccount(accNo, totalBalance);
		
		// Prompt and read deposit amount, then deposit it into the account
		System.out.println("Enter the amount you want to Deposit: ");
		double depositAmount = s.nextDouble();
		ba.deposit(depositAmount);
		
		// Prompt and read withdrawal amount, then withdraw it from the account
		System.out.println("Enter the amount you want to Withdraw: ");
		double withdrawAmount = s.nextDouble();
		ba.withdraw(withdrawAmount);
		
		// Prompt and read fees, then create a CheckingAccount object and deduct the fee
		System.out.println("Enter Fees: ");
		fees = s.nextDouble();
		CheckingAccount ca = new CheckingAccount(accNo, totalBalance, fees);
		ca.deductFee(fees);
		
		// Prompt and read interest rate, then create a SavingsAccount object and add interest
		System.out.println("Enter Interest Rate: ");
		interestRate = s.nextDouble();
		SavingsAccount sa = new SavingsAccount(accNo, totalBalance, interestRate);
		double interest = sa.addInterest(interestRate);
		
		// Calculate the total balance after all transactions
		totalBalance = totalBalance + depositAmount - withdrawAmount - fees + interest;

		// Display the current balance
		ba.getBalance();

		s.close(); // Close the Scanner object
	}
}
