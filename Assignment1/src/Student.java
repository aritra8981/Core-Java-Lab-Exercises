import java.util.Scanner;  // Import the Scanner class for taking user input

public class Student {
	static int id;  // Static variable to store student ID
	static String name;  // Static variable to store student name
	static int mark;  // Static variable to store student mark
	String result;  // Instance variable to store result (Pass/Fail)

	// Method to read student details from user input
	public void readDetails() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object for input
		
		// Prompt and read student ID
		System.out.println("Enter Student's Id: ");
		id = sc.nextInt();
		
		// Consume the newline character left by nextInt()
		sc.nextLine();
		
		// Prompt and read student name
		System.out.println("Enter Student's Name: ");
		name = sc.nextLine();
		
		// Prompt and read student marks
		System.out.println("Enter Student's Marks: ");
		mark = sc.nextInt();

		// Close the Scanner object to prevent resource leaks
		sc.close();
	}

	// Method to determine the result based on marks
	public void checkResult() {
		if (mark > 50) {
			result = "Pass";  // Assign "Pass" if marks are greater than 50
		} else {
			result = "Fail";  // Assign "Fail" if marks are 50 or less
		}
	}

	// Method to display student details and result
	public void dispDetails() {
		System.out.println("Student's Id: " + id);  // Display student ID
		System.out.println("Student's Name: " + name);  // Display student name
		System.out.println("Student's Mark: " + mark);  // Display student marks
		System.out.println("Student's Result: " + result);  // Display student result
	}
}
