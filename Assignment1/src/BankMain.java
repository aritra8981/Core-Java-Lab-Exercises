import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// Creating Account object with initial balance
		Account a = new Account(154824, "Aritra", 25000);

		System.out.println("Enter Withdrawal amount: Rs. ");
		double withdrawAmount = s.nextDouble();
		a.withdraw(withdrawAmount);

		System.out.println("Enter Deposit amount: Rs. ");
		double depositAmount = s.nextDouble();
		a.deposit(depositAmount);

		System.out.println("Enter the rate (%): ");
		double rate = s.nextDouble();
		a.calculateInterest(rate);

		s.close();
	}

}
