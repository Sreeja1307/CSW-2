package CollectionFramework;
import java.util.*;
public class HashMapExample {
public static void main(String[] args) {
HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
 hmap1.put(63, "Sreeja");
 hmap1.put(44, "Anwesha");
 hmap1.put(32, "Sudeshna");
 hmap1.put(33, "Arpit");
 hmap1.put(9, "Debajyoti");
 hmap1.put(7, "Ayushman");
 hmap1.put(1, "Jagan");
Set set1 = hmap1.entrySet();
Iterator iterator1 = set1.iterator();
while (iterator1.hasNext()) {
Map.Entry ment1 = (Map.Entry) iterator1.next();
System.out.println("The value is: " + ment1.getValue() + " and key is: " + ment1.getKey());
 }
String va = hmap1.get(7);
System.out.println();
System.out.println("Index 7 has value of " + va);
 hmap1.remove(1);
Set set2 = hmap1.entrySet();
Iterator iterator2 = set2.iterator();
while (iterator2.hasNext()) {
Map.Entry ment2 = (Map.Entry) iterator2.next();
System.out.println("Now value is " + ment2.getValue() + " and key is: " + ment2.getKey());
 }
}
} 