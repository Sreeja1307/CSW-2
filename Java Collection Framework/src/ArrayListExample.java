package ch13;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al= new ArrayList<>(5);
		for(int i=1; i<=5; i++) {
			al.add(i);
		}
		System.out.println("Initial ArrayList: "+al);
		al.add(2, 99);
		System.out.println("After adding 99 at index 2: "+al);
		
		System.out.println("Element at index 3: "+al.get(3));
		al.remove(2);
		System.out.println("After removing the element at index 2: "+al);
		System.out.println("Index of element 4: "+ al.indexOf(4));
		System.out.println("Size of ArrayList: "+al.size());
		System.out.println("Is ArrayList enmpty? "+ al.isEmpty());
		al.clear();
		System.out.println("ArrayList after clear(): "+al);
		System.out.println("Is ArrayList enmpty? "+ al.isEmpty());
		
	}

}
