public class EmployeeMain {
    public static void main(String[] args) {
        // Create an instance of HourlyEmployee with SSN, first name, last name, and hourly salary
        HourlyEmployee hourlyEmployee = new HourlyEmployee("12345", "John", "Doe", 20.0);
        
        // Create an instance of SalariedEmployee with SSN, first name, last name, and fixed salary
        SalariedEmployee salariedEmployee = new SalariedEmployee("98765", "Jane", "Smith", 5000.0);

        // Display details of the HourlyEmployee
        System.out.println("Hourly Employee Details:");
        hourlyEmployee.print(); // Call print method to display employee details
        System.out.println("Gross Pay: " + hourlyEmployee.computeGrossPay(40)); // Compute and display gross pay for 40 hours
        System.out.println("Net Pay: " + hourlyEmployee.computeNetPay(40)); // Compute and display net pay for 40 hours
        
        // Display details of the SalariedEmployee
        System.out.println("\nSalaried Employee Details:");
        salariedEmployee.print(); // Call print method to display employee details
        System.out.println("Gross Pay: " + salariedEmployee.computeGrossPay()); // Compute and display gross pay
        System.out.println("Net Pay: " + salariedEmployee.computeNetPay()); // Compute and display net pay
    }
}
