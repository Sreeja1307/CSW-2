package Chapter13;
class Test4 {
		public<T> void show(T a) {
			System.out.println("Value of a: "+a);
		}
	}
	public class Q2 {
		public static void main(String[] args) {
	     Test4 ob1 = new Test4();
	     Test4 ob2 = new Test4();
	     ob1.show(19691);
	     ob2.show("Sreeja");
		}

	}
