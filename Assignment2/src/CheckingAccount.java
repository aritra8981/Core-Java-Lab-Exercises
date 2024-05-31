
public class CheckingAccount extends BankAccount {
	double fee;

	public CheckingAccount(int accountNumber, double totalBalance, double fee) {
		super(accountNumber, totalBalance);
		this.fee = fee;
	}

	public void deductFee(double fee) {

		totalBalance -= fee;
		System.out.println("Total Balance after fees deduction: " + totalBalance);
	}
}
