import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1001, "Shan", 90, "OS"));
        students.add(new Student(1002, "Raj", 40, "Java"));
        students.add(new Student(1003, "Kumar", 50, "Python"));
        students.add(new Student(1004, "Kiran", 90, "OS"));
        students.add(new Student(1005, "Kaveri", 100, "C"));

        // Write the list of Student objects to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\Demo2.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);

            // Close the file and object output streams
            fileOut.close();
            objectOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the list of Student objects from the file
        try {
            FileInputStream fileIn = new FileInputStream("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\Demo2.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Deserialize the ArrayList of Student objects
            ArrayList<Student> readStudents = (ArrayList<Student>) objectIn.readObject();

            // Initialize counters for pass and fail counts
            int passCount = 0;
            int failCount = 0;

            // Iterate through the list of students to determine their results
            for (Student student : readStudents) {
                if (student.getMarks() > 50) {
                    student.setResult("Pass");
                    passCount++;
                } else {
                    student.setResult("Fail");
                    failCount++;
                }
                // Print the student details
                System.out.println(student.toString());
            }

            // Sort the students by marks in ascending order
            Collections.sort(readStudents, Comparator.comparingDouble(Student::getMarks));
            System.out.println("After Sorting:");
            for (Student student : readStudents) {
                // Print the sorted student details
                System.out.println(student.toString());
            }

            // Determine the number of students who passed or failed in a particular subject
            String subject = "OS";
            int subjectPassed = 0;
            int subjectFailed = 0;
            for (Student student : readStudents) {
                if (student.getSubject().equalsIgnoreCase(subject)) {
                    if (student.getMarks() > 56) {
                        subjectPassed++;
                    } else {
                        subjectFailed++;
                    }
                }
            }
            // Print the number of students passed and failed in the specific subject
            System.out.println("Number of Students passed in " + subject + ": " + subjectPassed);
            System.out.println("Number of Students failed in " + subject + ": " + subjectFailed);

            // Close the file and object input streams
            fileIn.close();
            objectIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

