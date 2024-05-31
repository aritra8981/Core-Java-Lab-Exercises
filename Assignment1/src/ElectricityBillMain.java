
public class ElectricityBillMain {

	public static void main(String[] args) {

		ElectricityBill eb = new ElectricityBill();
		eb.readData();
		eb.showData();
		double bill = eb.computeBill();
		System.out.println("Your Electricity Bill: " + bill);
	}

}
