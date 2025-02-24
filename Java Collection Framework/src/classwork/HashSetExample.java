package classwork;
import java.util.*;
public class HashSetExample {//unordered

    public static void main(String[] args) {
        HashSet<String> haset = new HashSet<String>();
        haset.add("Apricot");
        haset.add("Mango");
        haset.add("Orange");
        haset.add("Strawberry");
        haset.add("Dates");
        haset.add("Orange");
        haset.add("Mango");
        haset.add(null);
        haset.add(null);
        System.out.println("Hashset: " + haset);
        haset.remove("Dates");
        System.out.println("Hashset: " + haset);
        

        HashSet<Integer> haset1 = new HashSet<Integer>(); 
        haset1.add(55);
        haset1.add(78);
        haset1.add(97);
        haset1.add(13);
        haset1.add(64);
        //duplicates
        haset1.add(78);
        haset1.add(55);
        //multiple
        haset1.add(null);
        haset1.add(null);
        System.out.println("Hashset: " + haset1);
        haset1.remove(55);
        System.out.println("Hashset: " + haset1);
        
    }

}
