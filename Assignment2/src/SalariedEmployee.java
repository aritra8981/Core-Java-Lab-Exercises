import java.util.Scanner;

public class SalariedEmployee extends Employee {
	double salary;

	public SalariedEmployee(int ssn, String firstName, String lastName, double salary) {
		super(ssn, firstName, lastName);
		this.salary = salary;
	}

	public void computeGrossPay() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		double bsal = s.nextDouble();
		System.out.println("Enter HRA: ");
		double hra = s.nextDouble();
		System.out.println("Enter DA: ");
		double da = s.nextDouble();

		double grossSalary = bsal + hra + da;

		System.out.println("Your Gross Salary: " + grossSalary);

		s.close();

	}

	public void computeNetPay() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Gross Salary: ");
		double grossSal = s.nextDouble();
		System.out.println("Enter Your Income Tax: ");
		double itax = s.nextDouble();
		System.out.println("Enter Your PF: ");
		double pf = s.nextDouble();
		System.out.println("Enter Your PTax: ");
		double ptax = s.nextDouble();

		double netSal = grossSal - itax - pf - ptax;
		System.out.println("Your Net Salary: " + netSal);

		s.close();

	}

	public void displaySalEmp() {

		System.out.println("Hourly Employee Details: ");
		System.out.println("SSN: " + ssn);
		System.out.println("Name: " + firstName + " " + lastName);
	}
}
