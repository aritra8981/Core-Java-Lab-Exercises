//Extending the Person class.
public class Employeee extends Person {

    //Constructor for Employeee objects.
    public Employeee(String name, int age) {
        super(name, age);
    }

    
    //Prints the profession of the employee.
    public void myProfession() {
        System.out.println(name + " is an Employee.");
    }
}
