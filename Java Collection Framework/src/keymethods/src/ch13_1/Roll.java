package ch13_1;
import java.util.Comparator;
public class Roll implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRoll() - o2.getRoll();
	}
	

}
