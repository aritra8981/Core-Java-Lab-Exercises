//Extending the Employeee class.
public class ContractEmployee extends Employeee {

   
    //Constructor for ContractEmployee objects.
    public ContractEmployee(String name, int age) {
        super(name, age);
    }

    
	//Prints the profession of the contract employee.
    public void myProfession() {
        System.out.println(name + " is a Contract Employee.");
    }

}
