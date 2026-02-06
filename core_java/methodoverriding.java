class User {
    void login() 
    {
        System.out.println("User Logged In");
    }
}




class Custumer extends User{
    void login() 
    {
        System.out.println("User Logged In - Showing details ");
    }
}




class Seller extends User{
    void login()
    {
        System.out.println("Seller logged in - Showing dashboard");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
     

      Custumer c = new Custumer();
      c.login();

      Seller s = new Seller();
      s.login();

    }
}
