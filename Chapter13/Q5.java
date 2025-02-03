package Chapter13;
class Test3 {
	public<T, U> Test3(T a, T b){
		System.out.println("Value: "+a);
		System.out.println("Value: "+b);
	}
}
public class Q5 {
	public static void main(String[] args) {
		Test3 ob1 = new Test3(45, 88);
		Test3 ob2 = new Test3(66, 99);

	}

}
