// exception handling in java
// An exception is an unexpected problem that happens while the program is running — something that stops normal flow.



// to avoid this there are 4 main keywords in java to handle exceptions

// 1) try: The code that might throw an exception is placed inside the try block.

// 2) catch: The code that handles the exception is placed inside the catch block. It specifies the type of exception it can handle.

// 3) finally: The code inside the finally block will always be executed, regardless of whether an exception was thrown or caught. It is typically used for cleanup activities, such as closing resources.

// 4) throw: The throw keyword is used to explicitly throw an exception. It is followed by an instance of the exception class that you want to throw.


// try-catch 

    // public class MyExceptions {
        
    //     public static void main(String[] args) {
    //         try {
    //             int a = 10;
    //             int b = 0;
    //             int c = a / b;

    //             System.out.println("Result: " + c);
    //         }
    //         catch (ArithmeticException e) {
    //             System.out.println("Cannot divide by zero: " + e.getMessage());
    //         }

    //         System.out.println("Program continues after handling the exception.");
    //     }
    // }



//  finally 


// public class MyExceptions {
//     public static void main(String[] args) {
        
//     try {
//         int[] arr  = { 1, 2, 3};
//         System.out.println(arr[5]);
//     }

//     catch (ArrayIndexOutOfBoundsException e) {
//         System.out.println("Array index is out of bounds: " + e.getMessage());
//     }

//     finally {
//         System.out.println("This block will always be executed.");
//     }

//     }
// }


// throw keyword


// public class MyExceptions {
    
// public static void checkage(int age) {
//     if(age < 18 ) {
//         throw new ArithmeticException(" Age must be 18 or above to vote.");
//     }
//      else  {
//         System.out.println("You are eligible to vote.");
//      }

// }


// public static void main(String[] args) {
//     try {
//         checkage (15);
//     } 
//     catch (ArithmeticException e) {
//         System.out.println("Exception caught: " + e.getMessage());
//     }
// }
// }


//throws 



public class MyExceptions {
    
    public static void checkage(int age) throws ArithmeticException {
        if(age < 18 ) {
            throw new ArithmeticException(" Age must be 18 or above to vote.");
        }
         else  {
            System.out.println("You are eligible to vote.");
         }
    }
    
    
    public static void main(String[] args) {
        try {
            checkage (15);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
