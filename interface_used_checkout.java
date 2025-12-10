 // interface = rulebook
 interface PaymentsMethod  {
void pay(int amount);
}

// upi follows the rule
class UpiPayment implements PaymentsMethod {
    public void pay(int amount) {
        System.out.println("Paid" + " " +amount + " " +  "using UPI.");
    }
}


class CardPayement implements PaymentsMethod {
    public void pay (int amount) {
        System.out.println("paid"  + " " +amount + " " + "using card.");
    }
}
public class interface_used_checkout {

    public static void main(String[] args) {
       
    PaymentsMethod p1 = new UpiPayment();
    p1.pay(499);

    PaymentsMethod  p2 = new CardPayement();
    p2.pay(999);
   
}

}
