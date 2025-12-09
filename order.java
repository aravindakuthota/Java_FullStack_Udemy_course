// An innner class is a class inside another class 
// if we want to use for that class only and should not use for other class  we create inner class 



 class Order {
    
private int orderId;
private int  amount;



// constructuor 


public Order(int orderId , int amount) {
    this.orderId = orderId; 
    this.amount = amount;
}


// inner class 

class DeliveryStatus {
    private String status;
    public DeliveryStatus (String status) {
        this.status = status ;
    }

public void showStatus() {
    System.out.println("Order ID: " +orderId );
    System.out.println("Status :" +status);
}

}

public static void main(String[] args) {
    Order order = new Order(101, 999);

    Order.DeliveryStatus ds = order.new DeliveryStatus("out of delivery");
    ds.showStatus();
}

}
