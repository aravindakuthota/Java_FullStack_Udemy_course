package inheritance;

public class Electronics extends Product {
    String brand ;

    void showBrand() {

    display();
 
 System.out.println("Brand Name :" +brand);

    }


}



class MobilePhone extends Electronics {

String os;


void showPhoneDetails() {

 showBrand();

 System.out.println("OS USED " +os);





}

}