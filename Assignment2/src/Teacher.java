//Extending the Person class.
public class Teacher extends Person {

    // Constructor for Teacher objects.
    public Teacher(String name, int age) {
        super(name, age);
    }

    //Prints the profession of the teacher.
    public void myProfession() {
        System.out.println(name + " is a Teacher.");
    }

}
