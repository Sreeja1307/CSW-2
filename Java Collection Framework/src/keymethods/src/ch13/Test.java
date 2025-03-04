package ch13;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
	public static void main(String[] args) {
		ArrayList<Student> arr= new ArrayList<Student>();
		arr.add(new Student("Sreeja", 21, "123485", 90.0));
		arr.add(new Student("Anwesha", 21, "96961", 90.0));
		System.out.println("Before sorting:");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("After sorting:");
		System.out.println(arr);
		
	}

}
