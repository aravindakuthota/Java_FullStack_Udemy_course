 

 // Interface is a blueprint of a class. It has static constants and abstract methods.

// It is used to achieve abstraction and multiple inheritance in Java.
 
// It is also used to provide a common interface for different classes to implement.


// types of Interfaces in java

 // 1) Normal Interface : 

    //  Has zero or more abstract methods
    // Can also have default and static methods (since Java 8)

// 2) Functional Interface // srm :  

// Has exactly one abstract method
// Can have any number of default and static methods
// Marked with @FunctionalInterface (optional but good practice)
// Used with lambda expressions and method references




//3) Marker Interface: 

// has zero abstract methods (empty interface)
// Used as a tag or marker to tell JVM or framework something special about the class




//   interface Animal {
//             void eat();
//             void sleep();
//         }

// // Implementing the interface
// class Dog implements Animal {
//     public void eat() {
//         System.out.println("Dog is eating");
//     }
//     public void sleep() {
//         System.out.println("Dog is sleeping");
//     }
// }

// public class InterfaceExample {
//             public static void main(String[] args) {
       

//                 // Example of an interface
      

//                 // Creating objects of the classes that implement the interface
//                 Dog dog = new Dog();
       

//                 // Calling the methods of the interface
//                 dog.eat();
//                 dog.sleep();
        
//             }
//         }


        // Functional Interface 


    interface MyFunctionalInterface {
    void myMethod();
}

            @FunctionalInterface
            interface MyFunctionalInterface2 {
    void myMethod();
    // void anotherMethod(); // This will cause a compilation error because a functional interface can only have one abstract method
}



public class InterfaceExample {
            public static void main(String[] args) {
       

                // Example of a functional interface
                MyFunctionalInterface myFunc = () -> System.out.println("Hello, World!");
                myFunc.myMethod();

                MyFunctionalInterface2 myFunc2 = () -> System.out.println("Hello, Functional Interface!");
                myFunc2.myMethod();
        
            }
        }




// Marker Interface





public interface Serializable { }      // empty!
public interface Cloneable { }         // empty!
public interface Remote { }            // empty!
