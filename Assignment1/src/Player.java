import java.util.Scanner;

public class Player {
	String name;
	int age;
	String countryName;
	int totalRun;

	public void readDetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player's Name: ");
		name = s.next();
		System.out.println("Enter Player's Age: ");
		age = s.nextInt();
		System.out.println("Enter Player's Country Name: ");
		countryName = s.next();
		System.out.println("Enter Player's Total Run: ");
		totalRun = s.nextInt();

		s.close();
	}

	public void checkRun() {
		if (totalRun > 5000) {
			dispPlayer();
		}
	}

	public void dispPlayer() {
		System.out.println("Player's Name: " + name);
		System.out.println("Player's Age: " + age);
		System.out.println("Player's Country Name: " + countryName);
		System.out.println("Enter Player's Total Run: " + totalRun);
	}
}