import java.util.Scanner;

// Main class to facilitate transactions using Bank class
public class BankAccountMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the amount to transact
        System.out.println("Enter the amount you want to transact: ");
        float amount = sc.nextFloat();
        
        // Display options for currency selection
        System.out.println("Choose an option from below: ");
        System.out.println("Press 1: From Rupees. ");
        System.out.println("Press 2: From Dollar. ");
        System.out.println("Press 3: From Pound. ");
        System.out.println("Press 4: Exit");
        
        // Create a reference variable of type CreditCard
        CreditCard c;
        
        // Read user's choice
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                c = new Bank();
                c.rupees(amount); // Make payment in Rupees
                break;
            case 2:
                c = new Bank();
                c.dollar(amount); // Make payment in Dollars
                break;
            case 3:
                c = new Bank();
                c.pound(amount); // Make payment in Pounds
                break;
            case 4:
                System.out.println("Thanks for using.");
                break;
            default:
                System.out.println("Invalid Option! Try Again");
        }

        sc.close(); // Close the scanner
    }

}
