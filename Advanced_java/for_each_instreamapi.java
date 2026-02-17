import java.util.Arrays;
import java.util.List;

public class for_each_instreamapi {

public static void main(String[] args) {
     
    List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
  
    //   // super short 
    //    fruits.forEach(fruit -> System.out.println(fruit));
    
        
  //  stream + foreach

    // fruits.stream()
    //       .filter(fruit -> fruit.length() > 5) // Filter fruits with names longer than 5 characters
    //       .forEach(fruit -> System.out.println(fruit)); // Print each filtered fruit
          


     fruits.forEach(fruit -> System.out.println(fruit));

}

}