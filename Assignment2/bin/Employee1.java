public class Employee1 {
    // Protected attributes for name and SSN, accessible within the class and
    // subclasses
    protected String name;
    protected String ssn;

    // Constructor to initialize the Employee1 object
    public Employee1(String name, String ssn) {
        this.name = name; // Set the name of the employee
        this.ssn = ssn; // Set the SSN of the employee
    }

    // Method to return the salary of the employee
    public double salary() {
        return 20000.00; // Default salary
    }

    // Override the toString method to provide a string representation of the
    // Employee1 object
    @Override
    public String toString() {
        return "Name: " + name + ", SSN: " + ssn + ", Salary: " + salary();
    }
}
