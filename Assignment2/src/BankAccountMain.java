import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to transact: ");
		float amount = sc.nextFloat();
		System.out.println("Choose an option from below: ");
		System.out.println("Press 1: From Rupees. ");
		System.out.println("Press 2: From Dollar. ");
		System.out.println("Press 3: From Pound. ");
		System.out.println("Press 4: Exit");
		CreditCard c;

		int choice = sc.nextInt();

		switch (choice) {
			case 1:
				c = new Bank();
				c.rupees(amount);
				break;
			case 2:
				c = new Bank();
				c.dollar(amount);
				break;
			case 3:
				c = new Bank();
				c.pound(amount);
				break;
			case 4:
				System.out.println("Thanks for using.");
				break;
			default:
				System.out.println("Invalid Option! Try Again");
		}

		sc.close();

	}

}
