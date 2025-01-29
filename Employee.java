package newproject;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if(salary<=0) {
        System.out.println("Enter a valid salary");	
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        
        emp.setEmployeeId(9691);
        emp.setEmployeeName("Sreeja Swayamsiddha");
        emp.setDesignation("Intern");
        emp.setSalary(50000);
        
        System.out.println("Employee details are:- ");
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
    }
}
