
// method overriding 

package flipkart;


class User {
    void login() {
        System.out.println("User logged in - base case ");
    }

    void login(String username , String password) {
        System.out.println("User Logged in with username :" +username);
    }
    

    void login(long phone, int otp) 
    {
        System.out.println("User logged in with phone :" +phone);
    }


}


public class method_overloading {



public static void main(String[] args) {
    


User u = new User();

u.login("aravind" , "aravind123");
u.login(9866167923L , 4321);


}


}
