package Chapter13;
class Test2 {
	public<T> Test2(T a){
		System.out.println("Value: "+a);
	}
}
public class Q4 {
	public static void main(String[] args) {
		Test2 ob = new Test2(45);
		Test2 ob2 = new Test2(66);

	}

}
