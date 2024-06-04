import java.util.ArrayList;

public class Payroll {
    // Private attribute to store a list of employees
    private ArrayList<Employee1> employees;

    // Constructor to initialize the Payroll object
    public Payroll() {
        this.employees = new ArrayList<>(); // Initialize the ArrayList of employees
    }

    // Method to add an employee to the payroll
    public void addEmployee(Employee1 employee) {
        employees.add(employee); // Add the provided employee to the list
    }

    // Method to pay salary to all employees and print their details
    public void paySalary() {
        for (Employee1 employee : employees) { // Iterate through each employee in the list
            System.out.println(employee); // Print the details of the employee, including the computed salary
        }
    }
}
