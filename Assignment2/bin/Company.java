public class Company {
    public static void main(String[] args) {
        // Create a Payroll object to manage employee salaries
        Payroll payroll = new Payroll();

        // Add different types of employees to the payroll
        payroll.addEmployee(new CommissionEmployee("Akash Rauth", "785496", 5000, 0.10));
        payroll.addEmployee(new HourlyEmployee1("Juli Sinha", "263548", 20, 40));
        payroll.addEmployee(new SalariedEmployee1("Ritu Raj", "32548", 60000));

        // Pay salary to all employees and print their details
        payroll.paySalary();
    }
}
