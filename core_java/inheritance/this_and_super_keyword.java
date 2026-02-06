
// this and super keyword 

// Imagine you are writing your name on your notebook.
//  When you say “this notebook is mine,” the word “this” points to your own notebook.
// In Java, this means “this object — the one I’m talking about right now.”



// SUPER CLASS 

// Imagine your dad gives you some money, and you add your pocket money to it.
//  When you say “super dad,” you’re pointing to the parent.
// In Java, super means “use something from the parent class.”
// 👍 Why is super used?
// To call parent class variables


// To call parent class methods


// To call parent constructors




class A {

    public A()
    {
        System.out.println("in A");
    }




    public A(int n ) {
        System.out.println("in A int");
    }

}
class B extends A  {
 

    public B() {
        System.out.println("int B");
    }

}


public class this_and_super_keyword {
    public static void main(String[] args) {
        B obj = new B();


    }
}