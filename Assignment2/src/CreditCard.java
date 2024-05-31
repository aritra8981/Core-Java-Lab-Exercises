
public interface CreditCard {
	void rupees(float amount);

	void dollar(float amount);

	void pound(float amount);
}

class Bank implements CreditCard {

	@Override
	public void rupees(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid in Rupees");

	}

	@Override
	public void dollar(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid in Dollar");

	}

	@Override
	public void pound(float amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid in Pound");

	}

}