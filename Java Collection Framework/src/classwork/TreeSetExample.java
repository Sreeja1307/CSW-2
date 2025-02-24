package classwork;
import java.util.*;

public class TreeSetExample { // Ascending ordered

    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Apricot");
        tset.add("Mango");
        tset.add("Orange");
        tset.add("Strawberry");
        tset.add("Dates");
        
        // Adding duplicates won't affect the set.
        tset.add("Orange");
        tset.add("Mango");
        
        System.out.println("TreeSet: " + tset);
        tset.remove("Dates");
        System.out.println("TreeSet: " + tset);
        
        TreeSet<Integer> tset1 = new TreeSet<Integer>(); 
        tset1.add(55);
        tset1.add(78);
        tset1.add(97);
        tset1.add(13);
        tset1.add(64);
        
        // Adding duplicates won't affect the set.
        tset1.add(78);
        tset1.add(55);
        
        System.out.println("TreeSet: " + tset1);
        tset1.remove(55);
        System.out.println("TreeSet: " + tset1);
    }
}
