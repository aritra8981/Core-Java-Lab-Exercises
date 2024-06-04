public class SalariedEmployee1 extends Employee1 {
    // Private attribute for basic salary
    private double basicSalary;

    // Constructor to initialize the SalariedEmployee1 object
    public SalariedEmployee1(String name, String ssn, double basicSalary) {
        super(name, ssn); // Call the constructor of the superclass Employee1
        this.basicSalary = basicSalary; // Set the basic salary
    }

    // Override the salary method to return the basic salary
    @Override
    public double salary() {
        return basicSalary; // Return the basic salary
    }

    // Override the toString method to provide a string representation of the SalariedEmployee1 object
    @Override
    public String toString() {
        return super.toString() + ", Basic Salary: " + basicSalary;
    }
}
