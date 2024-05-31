
public class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(int accountNumber, double totalBalance, double interestRate) {
		super(accountNumber, totalBalance);
		this.interestRate = interestRate;
	}

	public double addInterest(double interestRate) {
		double totalInterest = (totalBalance * interestRate);
		System.out.println("Interest earned: Rs. " + totalInterest);
		totalBalance += totalInterest;
		System.out.println("Your Total Balance: Rs. " + totalBalance);
		return totalBalance;
	}
}
