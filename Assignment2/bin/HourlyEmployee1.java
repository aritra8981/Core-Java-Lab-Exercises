public class HourlyEmployee1 extends Employee1 {
    // Private attributes for wage and hours worked
    private double wage;
    private double hours;

    // Constructor to initialize the HourlyEmployee1 object
    public HourlyEmployee1(String name, String ssn, double wage, double hours) {
        super(name, ssn); // Call the constructor of the superclass Employee1
        this.wage = wage; // Set the hourly wage
        this.hours = hours; // Set the number of hours worked
    }

    // Override the salary method to calculate the salary based on wage and hours worked
    @Override
    public double salary() {
        return wage * hours; // Calculate salary as wage multiplied by hours worked
    }

    // Override the toString method to provide a string representation of the HourlyEmployee1 object
    @Override
    public String toString() {
        return super.toString() + ", Wage: " + wage + ", Hours: " + hours;
    }
}
