// Employee information interface
interface EmpInfo 
{
    final static String name = " ";
    final static int id = 0;
    void details(String n, int i);
}

// Salary interface
interface Salary
{
    final static double totalsalary = 0.0;
    void salaryCalc(double basicSalary, double bonus, double deductions);
}

// EmployeePayslip class
class EmpPayslip implements EmpInfo, Salary
{
    private String empName = name; // Initialize with default from interface
    private int empId = id;       // Initialize with default from interface
    private double totalSalary = totalsalary; // Initialize with default from interface
    // Implement the details method
    public void details(String n, int i)
    {
        this.empName=n;
        this.empId=i;
    }

    // Implement the salaryCalc method
    public void salaryCalc(double basicSalary, double bonus, double deductions)
    {
        this.totalSalary = basicSalary + bonus - deductions;
    }

    // Method to display the payslip
     public void display() 
    {
        System.out.println("Employee Payslip");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        System.out.println("Total Salary: $" + totalSalary);
    }
}

// Main class
public class MultipleInheritance

{
    public static void main(String[] args) {
        EmpPayslip emp = new EmpPayslip();

        // Set employee details
        emp.details("Alice", 101);

        // Calculate the salary
        emp.salaryCalc(5000, 1000, 200);

        // Display the payslip
        emp.display();
    }
}