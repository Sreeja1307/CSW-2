package Chapter13;

class Demo1<T> { //Generic class
 private T value;
 public Demo1(T value) {
     this.value = value;
 }
 public void show() {
     System.out.println("The value is: " + value);
 }
}

public class Q1 {
 public static void main(String[] args) {
     Demo1<Integer> Obj1 = new Demo1<>(62);
     Obj1.show();

     Demo1<String> Obj2 = new Demo1<>("Sreeja");
     Obj2.show();
 }
}
