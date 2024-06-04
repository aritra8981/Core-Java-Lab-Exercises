// Interface representing a credit card with methods for making payments in different currencies
public interface CreditCard {
    // Method to make payment in Rupees
    void rupees(float amount);

    // Method to make payment in Dollars
    void dollar(float amount);

    // Method to make payment in Pounds
    void pound(float amount);
}

// Class implementing the CreditCard interface
class Bank implements CreditCard {

    // Method implementation for making payment in Rupees
    @Override
    public void rupees(float amount) {
        System.out.println(amount + " paid in Rupees");
    }

    // Method implementation for making payment in Dollars
    @Override
    public void dollar(float amount) {
        System.out.println(amount + " paid in Dollar");
    }

    // Method implementation for making payment in Pounds
    @Override
    public void pound(float amount) {
        System.out.println(amount + " paid in Pound");
    }
}
