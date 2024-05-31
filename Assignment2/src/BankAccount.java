
public class BankAccount {
	int accountNumber;
	double totalBalance;

	public BankAccount(int accountNumber, double totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			totalBalance += depositAmount;
			System.out.println("Rs. " + depositAmount + " Deposited Successfully. Current Balance Rs. " + totalBalance);
		}
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= totalBalance) {
			totalBalance -= withdrawAmount;
			System.out.println(withdrawAmount + "Withdrawn Successfuylly. Current Balance: " + totalBalance);
		} else {
			System.out.println("Insufficient Balance.");
		}
	}

	public void getBalance() {
		System.out.println("Your Current Balance is: " + totalBalance);
	}
}
