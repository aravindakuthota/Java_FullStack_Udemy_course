package Advanced_java;

// Abstract in Java is used to define incomplete classes or methods that must be completed by child classes to achieve abstraction.


// basically abstract classs is a half finished plan 
// for example when we write notes or assignments in our school days we feel overloaded and we assign the remaining task to our siblings in favour of chocolates or gifts 



abstract class Homework {
   abstract void Sister();

   void brother () {
       System.out.println("Done half of his work");
   }

}


   class Sister extends Homework {
         void Sister() {
              System.out.println("Done her work on time");
         }
   }





public class Abstract_keyword {
    public static void main(String[] args) {
        
     Homework obj = new Sister();
        obj.Sister();
        obj.brother();

        
    }

}

