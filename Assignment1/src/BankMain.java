import java.util.Scanner;  // Import the Scanner class for taking user input

public class BankMain {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner s = new Scanner(System.in);

        // Creating an Account object with initial details
        Account a = new Account(154824, "Aritra", 25000);

        // Prompt and read the amount to withdraw
        System.out.println("Enter Withdrawal amount: Rs. ");
        double withdrawAmount = s.nextDouble();
        // Call the withdraw method to process the withdrawal
        a.withdraw(withdrawAmount);

        // Prompt and read the amount to deposit
        System.out.println("Enter Deposit amount: Rs. ");
        double depositAmount = s.nextDouble();
        // Call the deposit method to process the deposit
        a.deposit(depositAmount);

        // Prompt and read the interest rate
        System.out.println("Enter the rate (%): ");
        double rate = s.nextDouble();
        // Call the calculateInterest method to compute the interest
        a.calculateInterest(rate);

        // Close the Scanner object to prevent resource leaks
        s.close();
    }
}
