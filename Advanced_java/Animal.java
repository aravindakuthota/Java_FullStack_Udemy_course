//  An interface is like a rule book that says “you must do these things"


// main types of interfaces in Java:

// 1) Normal Interface
 // 2) Functional Interface / SAM (Single Abstract Method) Interface
// 3) Marker Interface

    // 1) serialization 
    // 2) unserialization

package Advanced_java;

// Normal Interface

public interface Animal {

    void eat();
    void sleep();
}


class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class types_of_interfaces_demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}


