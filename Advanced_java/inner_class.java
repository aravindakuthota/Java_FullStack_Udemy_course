package Java_FullStack_Udemy_course.Advanced_java;

// An inner class is a class defined inside another class and it needs an outer class object to be created.


class Outer {
        int outerField = 10;

        class Inner {
            void display() {
                System.out.println("Outer field is: " + outerField);
            }
        }
    }


public class inner_class {
   
public static void main(String[] args) {
    Outer outer = new Outer();   // outer object
    Outer.Inner inner = outer.new Inner(); // inner object 
    
    inner.display();




}

}
