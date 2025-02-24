package classwork;
import java.util.*;
public class LinkedHashSetExample {//Insert ordered

    public static void main(String[] args) {
        LinkedHashSet<String> liha = new LinkedHashSet<String>();
        liha.add("Apricot");
        liha.add("Mango");
        liha.add("Orange");
        liha.add("Strawberry");
        liha.add("Dates");
        
        liha.add("Orange");
        liha.add("Mango");
        
        liha.add(null);
        liha.add(null);
        System.out.println("Linked Hashset: " + liha);
        liha.remove("Dates");
        System.out.println("Linked Hashset: " + liha);
        

        LinkedHashSet<Integer> liha1 = new LinkedHashSet<Integer>(); 
        liha1.add(55);
        liha1.add(78);
        liha1.add(97);
        liha1.add(13);
        liha1.add(64);
        //duplicates
        liha1.add(78);
        liha1.add(55);
        //multiple
        liha1.add(null);
        liha1.add(null);
        System.out.println("Hashset: " + liha1);
        liha1.remove(55);
        System.out.println("Hashset: " + liha1);
        
    }

}
