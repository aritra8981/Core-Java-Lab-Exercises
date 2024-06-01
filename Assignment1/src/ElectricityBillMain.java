public class ElectricityBillMain {

	public static void main(String[] args) {
		// Create an instance of the ElectricityBill class
		ElectricityBill eb = new ElectricityBill();
		
		// Call the method to read customer data from user input
		eb.readData();
		
		// Call the method to display customer data
		eb.showData();
		
		// Call the method to compute the electricity bill and store the result
		double bill = eb.computeBill();
		
		// Display the computed electricity bill
		System.out.println("Your Electricity Bill: " + bill);
	}
}
