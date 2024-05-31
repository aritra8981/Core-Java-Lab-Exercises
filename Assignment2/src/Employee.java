
public class Employee {
	int ssn;
	String firstName;
	String lastName;

	public Employee(int ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void dispEmpDetails() {
		System.out.println("Employee Details: ");
		System.out.println("SSN: " + ssn);
		System.out.println("First Name: " + firstName);
		System.out.println("lastName: " + lastName);
	}
}
