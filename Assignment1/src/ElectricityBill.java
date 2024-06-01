import java.util.Scanner; // Import the Scanner class for taking user input

public class ElectricityBill {
	int customerNumber; // Variable to store customer number
	String customerName; // Variable to store customer name
	int unitsConsumed; // Variable to store the number of units consumed

	// Method to read customer data from user input
	public void readData() {
		Scanner s = new Scanner(System.in); // Create a Scanner object for input

		// Prompt and read customer number
		System.out.println("Enter Customer Number: ");
		customerNumber = s.nextInt();
		
		// Consume the newline character left by nextInt()
		s.nextLine();
		
		// Prompt and read customer name
		System.out.println("Enter Customer Name: ");
		customerName = s.nextLine();

		// Prompt and read the number of units consumed
		System.out.println("Enter the number of units you have consumed: ");
		unitsConsumed = s.nextInt();

		// Close the Scanner object to prevent resource leaks
		s.close();
	}

	// Method to display customer data
	public void showData() {
		// Display customer number
		System.out.println("Customer Number: " + customerNumber);

		// Display customer name
		System.out.println("Customer Name: " + customerName);

		// Display the number of units consumed
		System.out.println("Units Consumed: " + unitsConsumed);
	}

	// Method to compute the electricity bill based on units consumed
	public double computeBill() {
		double bill; // Variable to store the computed bill amount

		// Calculate the bill amount based on different slabs
		if (unitsConsumed <= 100) {
			bill = unitsConsumed * 1.20; // First 100 units at $1.20 per unit
		} else if (unitsConsumed <= 300) {
			bill = 100 * 1.20 + (unitsConsumed - 100) * 2.00; // Next 200 units at $2.00 per unit
		} else if (unitsConsumed <= 600) {
			bill = (100 * 1.20) + (200 * 2.00) + (unitsConsumed - 300) * 3.00; // Next 300 units at $3.00 per unit
		} else {
			bill = (100 * 1.20) + (200 * 2.00) + (300 * 3.00) + (unitsConsumed - 600) * 5.00; // Above 600 units at $5.00 per unit
																								
		}

		// Return the computed bill amount
		return bill;
	}
}
