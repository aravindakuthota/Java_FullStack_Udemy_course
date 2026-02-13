class TicketCounter {

     private int tickets = 30;

     public void bookTicket(String name , int wantedTickets) {

        System.out.println(name + " is trying to book " + wantedTickets + " tickets.");


            synchronized(this) {

            if(tickets >= wantedTickets) {
                tickets -= wantedTickets;

                System.out.println(name + " booked " + wantedTickets + " tickets. Remaining: " + tickets);
             } else {
                System.out.println("Sorry " + name + ", not enough tickets available. Remaining: " + tickets);
             }

     
            }
    }


}


public class MySynchronized {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(() -> {
            counter.bookTicket("Alice", 30);
        });

        Thread t2 = new Thread(() -> {
            counter.bookTicket("Bob", 50);
        });

        Thread t3 = new Thread(() -> {
            counter.bookTicket("Charlie", 20);
        });

        t1.start();
        t2.start();
        t3.start();

    }

}





