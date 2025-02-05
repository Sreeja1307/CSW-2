package CollectionFramework;
import java.util.*;
public class TreeMapExample {
public static void main(String[] args) {
TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();
trmap.put(1, "Object 1");
trmap.put(20, "Object 2");
trmap.put(31, "Object 3");
trmap.put(45, "Object 4");
trmap.put(52, "Object 5");
trmap.put(64, "Object 6");
trmap.put(70, "Object 7");
Set set = trmap.entrySet();
Iterator iterator1 = set.iterator();
while (iterator1.hasNext()) {
Map.Entry ment = (Map.Entry) iterator1.next();
System.out.print("key is: " + ment.getKey() + " and Value is: ");
  System.out.println(ment.getValue());
 }
}
} 