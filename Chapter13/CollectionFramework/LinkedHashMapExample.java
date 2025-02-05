package CollectionFramework;
import java.util.*;
public class LinkedHashMapExample {
	
		 public static void main(String[] args) {
		 LinkedHashMap<Integer, String> lihamap = new LinkedHashMap<Integer, String>();
		  lihamap.put(63, "Sreeja");
		  lihamap.put(44, "Anwesha");
		  lihamap.put(07, "Ayushman");
		  lihamap.put(9, "Debajyoti");
		  lihamap.put(33, "Arpit");
		  lihamap.put(1, "Jagan");
		  lihamap.put(2, "Amlan");
		 Set set1 = lihamap.entrySet();
		 Iterator iter1 = set1.iterator();
		 while (iter1.hasNext()) {
		 Map.Entry me = (Map.Entry) iter1.next();
		 System.out.print("The key is: " + me.getKey() + " and Value is: " + me.getValue() + "\n");
		  }
	 }
 }
