package newproject;

class Person {
	String name; int age;
	public Person(String name,int age)	{
		this.name=name;		
		this.age=age;
	}
	public void display()	{
		System.out.println("Name is: "+name+"\nAge is: "+age);
	}
}

class Employee extends Person {
	int employeeId;	double salary;
	public Employee(String name,int age,int empid,double sal) {
		super(name,age);
		employeeId=empid;	
		salary=sal;
	}
	public void display()	{
		super.display();
		System.out.println("Employee ID is: "+employeeId+"\nSalary is: "+salary);
	}
}

class Developer extends Employee {
	String proglang,projname;
	public Developer(String name,int age,int empid,double sal,String proglang,String projname)	{
		super(name,age,empid,sal);
		this.proglang=proglang;		
		this.projname=projname;
	}
	public void display()	{
		super.display();
		System.out.println("Developer's Language is: "+proglang+"\nDEveloper's Project Name is: "+projname);
	}	
}
public class Q4 {
	public static void main(String[] args) {
		Developer dev=new Developer("Sreeja",21,230,750000.0,"Java","Eclipse Project");
		dev.display();
	}
}