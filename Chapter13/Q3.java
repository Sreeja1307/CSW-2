package Chapter13;

class Test1 {
	public<T, U> void show(T a, T b) {
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
}
public class Q3 {
	public static void main(String[] args) {
     Test1 ob1 = new Test1();
     ob1.show(1207,"CSW2");
	}
}
