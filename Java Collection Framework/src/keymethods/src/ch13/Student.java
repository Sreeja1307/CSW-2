package ch13;
public class Student implements Comparable<Student>{
	String name;
	int roll;
	String phone;
	double marks;
	Student(String name, int roll, String phone, double marks){
		this.name=name;
		this.roll=roll;
		this.phone=phone;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	public int getRoll() {
		return roll;
	}
	public double getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "Student [name="+name+", Phone="+phone+", id="+roll+", marks="+marks+"]";
	}
}
