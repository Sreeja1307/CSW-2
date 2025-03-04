package ch13_1;
import java.util.Comparator;
public class Name implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}