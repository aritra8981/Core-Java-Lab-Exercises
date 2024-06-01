public class StudentMain {

	public static void main(String[] args) {
		// Create an instance of the Student class
		Student s1 = new Student();
		
		// Call the method to read student details from user input
		s1.readDetails();
		
		// Call the method to determine the student's result based on marks
		s1.checkResult();
		
		// Call the method to display student details and result
		s1.dispDetails();
	}
}
