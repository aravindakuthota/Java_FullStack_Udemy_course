// cant reuse it 

// new Book().read();  // Anonymous object - no name/reference
// Real-life analogy:

// You pick up a book, read it immediately, and put it back

// No catalog number/label assigned

// Can't use it again later (no way to reference it)

// Like reading a magazine in the library without checking it out


class A {

    public A()
    {
        System.out.println("object created");
    }
    
        public void show()
        {
            System.out.println("in A show");
        }
        
}

public class anonymousobjects {
 
    
public static void main(String[] args) {


    new A();  // Anonymous object 
    



}


}
