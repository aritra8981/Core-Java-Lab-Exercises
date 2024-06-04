//Extending the Employeee class.
public class PermanentEmployee extends Employeee {

    
    //Constructor for PermanentEmployee objects.
    public PermanentEmployee(String name, int age) {
        super(name, age);
    }

    
    //Prints the profession of the permanent employee.
    public void myProfession() {
        System.out.println(name + " is a Permanent Employee.");
    }

}
