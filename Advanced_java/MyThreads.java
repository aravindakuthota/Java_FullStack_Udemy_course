// This program demonstrates how to create and use threads in Java.



// class MyTask extends Thread {
//     public void run() {           // this is the job this worker will do
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Child thread: " + i);
//             try { 
//                 Thread.sleep(500);   // wait 0.5 second
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class threads {
//     public static void main(String[] args) {

//         MyTask t1 = new MyTask();     // create worker
//         t1.start();                   // tell worker: "Start your job!"

//         // Main thread keeps working
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Main thread: " + i);
//         }

//         System.out.println("Main finished");
//     }
// }





// This program demonstrates how to create and use threads in Java using Runnable interface.




class MyTask implements Runnable {
    public void run() {           // this is the job this worker will do
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child thread: " + i);
            try { 
                Thread.sleep(500);   // wait 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyThreads {
    public static void main(String[] args) {

        MyTask task = new MyTask();     // create worker
        Thread t1 = new Thread(task);   // wrap worker in a Thread
        t1.start();                   // tell worker: "Start your job!"

        // Main thread keeps working
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }

        System.out.println("Main finished");
    }
}






