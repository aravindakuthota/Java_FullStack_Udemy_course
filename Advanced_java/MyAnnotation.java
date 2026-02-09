package Advanced_java;

class Dog{
    
    void eat(){
        System.out.println("eating...");
    }

}

class BabyDog extends Dog{

 @Override
    void eat(){
        System.out.println("eating  biscuits  ...");
    }
}





public class MyAnnotation {
    public static void main(String[] args) {
        
    //    Dog d = new Dog();
    //      d.eat();
  
        BabyDog bd = new BabyDog();
        bd.eat();
       


    }
}
