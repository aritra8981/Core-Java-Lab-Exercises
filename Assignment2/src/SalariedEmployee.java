// Subclass: SalariedEmployee extends Employee
public class SalariedEmployee extends Employee {
    // Private field to store the fixed salary
    private double salary;

    // Constructor to initialize SalariedEmployee with ssn, firstName, lastName, and salary
    public SalariedEmployee(String ssn, String firstName, String lastName, double salary) {
        // Call the constructor of the superclass Employee
        super(ssn, firstName, lastName);
        // Initialize the salary field
        this.salary = salary;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to compute gross pay (for simplicity, assuming fixed salary)
    public double computeGrossPay() {
        return salary;
    }

    // Method to compute net pay (in this example, it's the same as gross pay)
    public double computeNetPay() {
        return computeGrossPay();
    }

    // Override the print method from the Employee class to include salary
    @Override
    public void print() {
        // Call the print method of the superclass to print SSN, first name, and last name
        super.print();
        // Print the salary
        System.out.println("Salary: " + salary);
    }
}
