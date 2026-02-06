package Java_FullStack_Udemy_course.Advanced_java;

// An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a contract that classes can implement.


interface Toy {

    void makeSound();


   default void showPrice() {
        System.out.println("The price of the toy is .");
    }
   }

   class CarToy implements Toy {

    @Override
    public void makeSound() {
        System.out.println("Vroom!");
    }
}



public class MyInterface {
	
public static void main(String[] args) {
    

    CarToy carToy = new CarToy();
    carToy.makeSound(); 
    carToy.showPrice(); 


}

}
