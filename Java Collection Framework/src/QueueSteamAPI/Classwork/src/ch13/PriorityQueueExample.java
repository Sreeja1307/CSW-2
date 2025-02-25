package ch13;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		 PriorityQueue<String> prQ = new PriorityQueue<String>();
		 prQ.add("C");
		 prQ.add("Java");
		 prQ.add("Python");
		 prQ.add("C++");
		 System.out.println("The head value by using peek function is: "+prQ.peek());
		 System.out.println("Th total queue elements: ");
		 Iterator itr1= prQ.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next()); 
		 }prQ.poll();
			System.out.println("After removing element with poll function: ");
			Iterator<String> itr2 = prQ.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			prQ.remove("Java");
			System.out.println("After removing Java with remove function: ");
			Iterator<String> itr3 = prQ.iterator();
			while(itr3.hasNext()) {
				System.out.println(itr3.next());
			}
			boolean a = prQ.contains("C");
			System.out.println("Does this priority queue contains C: "+a);
		 
	}
	

}
