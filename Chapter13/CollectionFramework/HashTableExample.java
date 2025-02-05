package CollectionFramework;
import java.util.*;
public class HashTableExample {
public static void main(String[] args) {
 Enumeration nms;
 String keys;
Hashtable<String, String> hashTable = new Hashtable<String, String>();
 hashTable.put("Key1", "Sreeja");
 hashTable.put("Key2", "Anwesha");
 hashTable.put("Key3", "Debajyoti");
 hashTable.put("Key4", "Ayushman");
 hashTable.put("Key5", "Arpit");
 hashTable.put("Key6", "Jagan");
 hashTable.put("Key7", "Diya");
nms = hashTable.keys();
while (nms.hasMoreElements()) {
keys = (String) nms.nextElement();
System.out.println("Key is " + keys + " & value is " + hashTable.get(keys));
 }
}
} 