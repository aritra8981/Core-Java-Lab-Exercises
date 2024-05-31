import java.util.Scanner;

public class Student {
	static int id;
	static String name;
	static int mark;
	String result;

	// public Student() {
	// this.id= id;
	// this.name= name;
	// this.mark= mark;
	// this.result= result;
	// }

	public void readDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Id: ");
		id = sc.nextInt();
		System.out.println("Enter Student's Name: ");
		name = sc.next();
		System.out.println("Enter Student's Marks: ");
		mark = sc.nextInt();

		sc.close();

	}

	public void checkResult() {
		if (mark > 50) {
			result = "Pass";
		} else {
			result = "Fail";
		}
	}

	public void dispDetails() {
		System.out.println("Student's Id: " + id);
		System.out.println("Student's Name: " + name);
		System.out.println("Student's Mark: " + mark);
		System.out.println("Student's Result: " + result);
	}
}
