package ch13_1;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student("Sreeja", 21, "123485", 90.0));
		arr.add(new Student("Anwesha", 20, "96961", 90.0));
		System.out.println("Before Sorting(of any Kind): ");
		System.out.println(arr);
		
		Collections.sort(arr,new Roll());
		System.out.println("After Sorting by Roll Number: \n"+arr);
		
		Collections.sort(arr,new Name());
		System.out.println("After Sorting by Name: \n"+arr);
	}
}