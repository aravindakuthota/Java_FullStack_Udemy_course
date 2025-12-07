// static keyword 


class  Mobile {

    String brand ;
    int price ;
    String name ;

    public void show() {
        System.out.println(brand + " :");
    }

}


public static void show1()


// we can use static varbalbe in static method 
// but cannot use static method in non static variable 

{
    System.out.println("in static method");
}



public class Demo1 {
    

public static void main(String[] args) {
    Mobile obj1 = new Mobile();
    obj1.brand = "VIVO";
    obj1.name = "smartphone";
    obj1.price = 1200;


obj1.show();

Mobile.show1;




}


}
