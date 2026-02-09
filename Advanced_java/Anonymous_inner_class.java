package Advanced_java;

// this is like writing stick notes while reading a book or for faster revision  while preparing for any  exam we use to write stick notes that is  called anonymous 

// we dont have seperate book for these type of short revision or formulas we usually use them in stick notes.



/*  “Imagine you placed an order on Amazon. After placing it, a small confirmation message pops up.
This action happens only once, and we don’t create a separate class for it.
 So we create a tiny class without a name, just for this one action.
 That is called an Anonymous Inner Class.”

*/

/*  It tells subjects, but not how the teacher teaches it.
if u ask me how to reach a destination i can guide u but how u want to reach the destination is decided by u .

*/


 interface notes {
void remember() ;
    
}


public class Anonymous_inner_class {

public static void main(String[] args) {
    
 notes stickyNote = new notes() {
    @Override

    public void remember() {
        System.out.println("Remember this formula: a² + b² = c²");
    }
 };


 stickyNote.remember();
}
}