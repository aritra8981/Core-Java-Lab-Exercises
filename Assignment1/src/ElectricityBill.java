import java.util.Scanner;

public class ElectricityBill {
	int customerNumber;
	String customerName;
	int unitsConsumed;

	public void readData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Customer Number: ");
		customerNumber = s.nextInt();
		System.out.println("Enter Customer Name: ");
		customerName = s.next();
		System.out.println("Enter the number the units you have consumed: ");
		unitsConsumed = s.nextInt();

		s.close();

	}

	public void showData() {
		System.out.println("Customer Number: " + customerNumber);

		System.out.println("Customer Name: " + customerName);

		System.out.println("Units Consumed: " + unitsConsumed);

	}

	public double computeBill() {
		double bill;

		if (unitsConsumed <= 100) {
			bill = unitsConsumed * 1.20;
		} else if (unitsConsumed <= 300) {
			bill = 100 * 1.20 + (unitsConsumed - 100) * 2.00;
		} else if (unitsConsumed <= 600) {
			bill = (100 * 1.20) + (200 * 2.00) + (unitsConsumed - 300) * 3.00;
		} else {
			bill = (100 * 1.20) + (200 * 2.00) + (300 * 3.00) + (unitsConsumed - 600) * 5.00;
		}

		return bill;
	}

}
