import java.util.Scanner; // Import the Scanner class for taking user input

public class Emp {
	int empno; // Variable to store employee number
	String empname; // Variable to store employee name
	String designation; // Variable to store employee designation
	String dept; // Variable to store employee department
	int salary; // Variable to store employee salary

	// Method to read employee data from user input
	public void readEmpData() {
		Scanner sc = new Scanner(System.in); // Create a Scanner object for input
		System.out.println("Enter Employee Number: ");
		empno = sc.nextInt(); // Read integer input for employee number
		System.out.println("Enter Employee Name: ");
		empname = sc.next(); // Read string input for employee name
		System.out.println("Enter Designation: ");
		designation = sc.next(); // Read string input for employee designation
		System.out.println("Enter Department: ");
		dept = sc.next(); // Read string input for employee department
		System.out.println("Enter Salary: ");
		salary = sc.nextInt(); // Read integer input for employee salary

		sc.close(); // Close the Scanner object to prevent resource leaks
	}

	// Method to display employee data
	public void displayEmpData() {
		System.out.println("Employee Number: " + empno); // Display employee number
		System.out.println("Employee Name: " + empname); // Display employee name
		System.out.println("Designation: " + designation); // Display employee designation
		System.out.println("Department: " + dept); // Display employee department
		System.out.println("Salary: " + salary); // Display employee salary
	}
}
