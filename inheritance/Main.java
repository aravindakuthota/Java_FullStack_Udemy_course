package inheritance;


class Product {
    String name ;
    double price ;




void display() {
    System.out.println("name  :" +name);
    System.out.println("price  :" +price);
}

}


public class Main {
    public static void main(String[] args) {
        

    
//    Product p = new Product();
//    p.name  = "Laptop";
//    p.price = 55000;


   
//    books  myBook = new books();
//    myBook.name = "Harry potter";
//    myBook.price = 150;
//    myBook.author = "Aravind";


//    myBook.showBookDetails();
//    p.display();

   
   MobilePhone myElectronics = new MobilePhone();
   myElectronics.name = "SmartPhone";
   myElectronics.price = 29999;
   myElectronics.brand = "Asus";
   myElectronics.os = "Android";
   
   myElectronics.showPhoneDetails();


    }
}
