// capsoules 

// close and tight outside cannot use 

// this is a keyword which represents current objects 

// every time we create onject it will be called 



class Human {

private int age;
private String name;
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}



// methods  -> ask for data 



}


public class encapsulation {
    
public static void main(String[] args) {
    

    Human obj = new Human();
    obj.setAge(11);
    obj.setString("Aravind");

    System.out.println(obj.getAge() + " , " +obj.getName());


}


}
