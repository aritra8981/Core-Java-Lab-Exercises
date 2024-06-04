public class CommissionEmployee extends Employee1 {
    // Private attributes for sales and commission rate
    private double sales;
    private double commission;

    // Constructor to initialize the CommissionEmployee object
    public CommissionEmployee(String name, String ssn, double sales, double commission) {
        super(name, ssn); // Call the constructor of the superclass Employee1
        this.sales = sales; // Set the sales amount
        this.commission = commission; // Set the commission rate
    }

    // Override the salary method to calculate the salary based on sales and
    // commission
    @Override
    public double salary() {
        return sales * commission; // Calculate salary as sales multiplied by commission rate
    }

    // Override the toString method to provide a string representation of the
    // CommissionEmployee object
    @Override
    public String toString() {
        return super.toString() + ", Sales: " + sales + ", Commission: " + commission;
    }
}
