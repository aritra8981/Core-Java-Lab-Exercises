import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		int accNo;
		double totalBalance;
		double fees;
		double interestRate;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Account Details Below: ");
		System.out.println("Enter Account Number: ");
		accNo = s.nextInt();
		System.out.println("Enter Total Balance: ");
		totalBalance = s.nextDouble();
		System.out.println("Enter Fees: ");
		fees = s.nextDouble();
		System.out.println("Enter Interest Rate: ");
		interestRate = s.nextDouble();

		CheckingAccount ca = new CheckingAccount(accNo, totalBalance, fees);
		SavingsAccount sa = new SavingsAccount(accNo, totalBalance, interestRate);

		ca.deductFee(fees);
		sa.addInterest(interestRate);

		// BankAccount b =new BankAccount(accNo,totalBalance);
		// System.out.println("Enter the amount you want to Withdraw: ");
		// double withdrawAmount = s.nextDouble();
		// b.withdraw(withdrawAmount);
		// System.out.println("Enter the amount you want to Deposit: ");
		// double depositAmount = s.nextDouble();
		// b.deposit(depositAmount);
		// b.getBalance();

		s.close();

	}

}
