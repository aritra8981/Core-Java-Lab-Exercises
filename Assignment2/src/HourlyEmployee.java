// Subclass: HourlyEmployee extends Employee
public class HourlyEmployee extends Employee {
    // Private field to store the hourly salary
    private double salary;

    // Constructor to initialize HourlyEmployee with ssn, firstName, lastName, and salary
    public HourlyEmployee(String ssn, String firstName, String lastName, double salary) {
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

    // Method to compute the gross pay based on hours worked
    public double computeGrossPay(int hoursWorked) {
        return salary * hoursWorked;
    }

    // Method to compute the net pay (in this example, it's the same as gross pay)
    public double computeNetPay(int hoursWorked) {
        return computeGrossPay(hoursWorked);
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
