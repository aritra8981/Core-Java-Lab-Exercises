
public class InheritanceExampleMain {

	public static void main(String[] args) {

		// Creating Objects
		Teacher teacher = new Teacher("Arvind", 35);
		Employeee emp = new Employeee("Aru", 37);
		PermanentEmployee permanentEmployee = new PermanentEmployee("Shubham", 45);
		ContractEmployee contractEmployee = new ContractEmployee("Ritik", 34);

		// Calling the methods
		teacher.myProfession();
		emp.myProfession();
		permanentEmployee.myProfession();
		contractEmployee.myProfession();

	}

}
