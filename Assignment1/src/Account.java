
public class Account {
	int accNo;
	String accName;
	double amount;

	public Account(int accNo, String accName, double amount) {
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= amount) {
			amount -= withdrawAmount;
			System.out.println("Withdrawal Successfull. Remaining Balance: Rs. " + amount);
		} else {
			System.out.println("Withdrawal failed! Insufficient Balance.");
		}

	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			amount += depositAmount;
			System.out.println(depositAmount + " Deposited Successfully! Updated Balance: Rs. " + amount);
		} else {
			System.out.println("Invalid Amount.");
		}

	}

	public void calculateInterest(double rate) {
		double interest = (amount + rate) / 100;
		System.out.println("Interest Earned: " + interest);
	}
}
