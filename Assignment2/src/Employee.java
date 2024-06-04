// Base class: Employee
public class Employee {
    // Private fields to store the employee's SSN, first name, and last name
    private String ssn;
    private String firstName;
    private String lastName;

    // Constructor to initialize the employee's SSN, first name, and last name
    public Employee(String ssn, String firstName, String lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter method for SSN
    public String getSSN() {
        return ssn;
    }

    // Setter method for SSN
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    // Getter method for first name
    public String getFirstName() {
        return firstName;
    }

    // Setter method for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for last name
    public String getLastName() {
        return lastName;
    }

    // Setter method for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to print the employee's information
    public void print() {
        // Print SSN
        System.out.println("SSN: " + ssn);
        // Print first name
        System.out.println("First Name: " + firstName);
        // Print last name
        System.out.println("Last Name: " + lastName);
    }
}
