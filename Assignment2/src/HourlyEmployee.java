import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double salary;

	public HourlyEmployee(int ssn, String firstName, String lastName, double salary) {
		super(ssn, firstName, lastName);
		this.salary = salary;
	}

	public void computeGrossPay() {
		Scanner s = new Scanner(System.in);
		double gsal;
		System.out.println("From how many days employee is working: ");
		int days = s.nextInt();
		System.out.println("From how many hours employee is working: ");
		int hours = s.nextInt();

		gsal = salary + days + hours;

		System.out.println("Employee's Hourly Gross Salary: " + gsal);
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

	}

	public void displayHourEmp() {

		System.out.println("Hourly Employee Details: ");
		System.out.println("SSN: " + ssn);
		System.out.println("Name: " + firstName + " " + lastName);
		

	}
}
