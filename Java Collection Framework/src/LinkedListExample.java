package ch13;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
	LinkedList l= new LinkedList<>();
	l.add("a");
    l.add("b");
	l.add("c");
    l.add("d");
	l.add("e");
	System.out.println("Initial LinkedList: "+l);
	System.out.println("First Element: "+l.getFirst());
	System.out.println("Last Element: "+l.getLast());
	System.out.println("Element at index 2: "+l.get(2));
	
	l.remove("b");
	l.remove(3);
	l.removeFirst();
	l.removeLast();
	System.out.println("After removals list: "+l);
	
	System.out.println("Index of 'e': "+ l.indexOf("e"));
	System.out.println("Size of LinkedList: "+l.size());
	System.out.println("Is LinkedList empty? "+ l.isEmpty());
	l.clear();
	System.out.println("LinkedList after clear(): "+l);
	System.out.println("Is LinkedList empty? "+ l.isEmpty());
	}
}
	
