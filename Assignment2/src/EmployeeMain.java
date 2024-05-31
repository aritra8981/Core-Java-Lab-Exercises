
public class EmployeeMain {

	public static void main(String[] args) {

		HourlyEmployee he = new HourlyEmployee(1001, "Aritra", "Das", 123456);

		he.computeGrossPay();
		he.computeNetPay();
		he.displayHourEmp();

		SalariedEmployee se = new SalariedEmployee(1001, "Aritra", "Das", 123456);

		se.computeGrossPay();
		se.computeNetPay();
		se.displaySalEmp();

	}

}
