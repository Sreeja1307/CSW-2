package chapter12;

public class Q11 {
    static class Employee {
        public double calculateSalary() {
            return 50000;  
        }
    }

    static class Manager extends Employee {
        @Override
        public double calculateSalary() {
            double baseSalary = 50000; 
            double bonus = 10000;      
            return baseSalary + bonus; 
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee Salary: Rs " + employee.calculateSalary());
        Manager manager = new Manager();
        System.out.println("Manager Salary: Rs " + manager.calculateSalary());
    }
}
