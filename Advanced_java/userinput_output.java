// using scanner and buffer reader to take user input and print it on console

// import java.util.Scanner;


// public class userinput_output {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();
//         System.out.println("Hello, " + name);
//         sc.close();
//     }
// }


// buffer reader example


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userinput_output {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Hello, " + name);
        br.close();
    }
}