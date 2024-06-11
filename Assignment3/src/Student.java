import java.io.Serializable;

// The Student class implements Serializable to allow objects of this class to be serialized
public class Student implements Serializable {
    // Fields for the Student class
    int id;
    String name;
    int marks;
    String subject;
    String result;
    
    // Constructor to initialize the Student object
    public Student(int id, String name, int marks, String subject) {
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter and setter methods for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter and setter methods for result
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    // Override the toString() method to return a string representation of the Student object
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subject=" + subject + ", result="
                + result + "]";
    }
}
