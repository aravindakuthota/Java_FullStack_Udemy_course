
import java.util.*;

public class CollectionsDemo {

    
public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       fruits.add("Grapes");
       fruits.add("Apple");
         System.out.println("Fruits: " + fruits);


         //Hashset( No duplicates and no order)


   Set<String> uniqeFruits = new HashSet<>(fruits);
   
     uniqeFruits.add("Mango");
     uniqeFruits.add("Banana"); // Duplicate, won't be added
     uniqeFruits.add("Banana");

    System.out.println("Unique Fruits: " + uniqeFruits);


   Map<Integer, String> studentMap = new HashMap<>();
   
   studentMap.put(1, "Alice");
    studentMap.put(2, "Bob");
    studentMap.put(3, "Charlie");
    System.out.println("Student Map: " + studentMap);







}




}
