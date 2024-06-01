import java.util.Scanner;  // Import the Scanner class for taking user input

public class Player {
	String name;  // Variable to store player's name
	int age;  // Variable to store player's age
	String countryName;  // Variable to store player's country name
	int totalRun;  // Variable to store player's total runs

	// Method to read player details from user input
	public void readDetails() {
		Scanner s = new Scanner(System.in);  // Create a Scanner object for input

		// Prompt and read player's name
		System.out.println("Enter Player's Name: ");
		name = s.nextLine();

		// Prompt and read player's age
		System.out.println("Enter Player's Age: ");
		age = s.nextInt();
		s.nextLine();  // Consume the newline character left by nextInt()

		// Prompt and read player's country name
		System.out.println("Enter Player's Country Name: ");
		countryName = s.nextLine();

		// Prompt and read player's total runs
		System.out.println("Enter Player's Total Run: ");
		totalRun = s.nextInt();
		s.nextLine();  // Consume the newline character left by nextInt()
	}

	// Method to check if the player's total runs exceed 5000
	public void checkRun() {
		if (totalRun > 5000) {
			dispPlayer();  // Call dispPlayer() method to display player details if total runs exceed 5000
		}
	}

	// Method to display player details
	public void dispPlayer() {
		System.out.println("Player's Name: " + name);  // Display player's name
		System.out.println("Player's Age: " + age);  // Display player's age
		System.out.println("Player's Country Name: " + countryName);  // Display player's country name
		System.out.println("Player's Total Run: " + totalRun);  // Display player's total runs
	}
}
