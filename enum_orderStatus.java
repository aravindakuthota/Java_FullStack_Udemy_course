




public class enum_orderStatus {

    //  Create enum (fixed set of values)

 enum OrderStatus {
        ORDERED,
        PACKED,
        SHIPPED,
        OUT_FOR_DELIVERY,
        DELIVERED
    }


    
    public static void main(String[] args) {
        




        //  Use enum
          OrderStatus status = OrderStatus.SHIPPED;

        //  Print status
        System.out.println("Your order status is: " + status);
    }
    }


