# Java Important Concepts – Explained Super Simply

## 1. Abstract Class
**What is it?**  
An abstract class is like a **half-finished house plan** or a **blueprint**.  
It gives rules (some methods without body) that every child class **must** follow, but you **cannot** make an object directly from it (no `new AbstractClass()`).

**Real-life example**  
Blueprint of a house — you can’t live in the blueprint, but every real house is built using it.


**Key points**
- Can have both normal methods + abstract methods
- Can have normal variables
- A class can **extend** only **one** abstract class

## 2. Inner Class
**What is it?**  
A class written **inside** another class.  
It usually belongs only to the outer class and works closely with it.

**Super short real-life example**  
Engine inside a Car — the engine only makes sense when it’s part of the car.


## 3. Anonymous Inner Class
**What is it?**  
A class with **no name** that you create and use only **once**, right where you need it.

**Real-life example**  
Writing on a **sticky note** for quick revision while studying.  
You don’t make a full new notebook just for one formula — you use a small sticky note.

**Real company example**  
Very common in old Swing GUI code (button listeners) and in unit tests.  
Used by almost **every** company.

## 4. Abstract Class + Anonymous Class (Powerful Combo)
**What happens?**  
- Abstract class = gives rules but no full code  
- Anonymous class = gives **one-time quick implementation** without making a separate class

**Real-life example**  
Amazon delivery:  
Amazon says “someone must deliver the product” (abstract rule).  
But they don’t care **who** delivers — they assign anyone randomly at that moment (anonymous class).

**Real company example**  
Very common in **Spring**, **JavaFX**, **testing frameworks** (**Netflix**, **Amazon**).

## 5. Interface
**What is it?**  
A **pure rule book** or **contract**.  
It only says **WHAT** to do (method names), never **HOW**.  
Any class that “signs” it must write the full code.

**Real-life example**  
USB port rule:  
Every device (mouse, keyboard, pen drive) must fit the same shape and send data the same way — but inside they are completely different.

**You can’t buy a “USB” itself — only things that follow the USB rule.**

**Real company example**  
`Comparable`, `Runnable`, `List` interfaces — used by **every** Java company (**Google**, **Microsoft**).

**Important rules**
- Class → Class : **extends**
- Class → Interface : **implements**
- Interface → Interface : **extends**
- A class can **implement many** interfaces

## Abstract Class vs Interface – Quick Comparison

| Question                     | Abstract Class                          | Interface                                 |
|------------------------------|-----------------------------------------|-------------------------------------------|
| Can have method body?        | Yes (normal + abstract methods)         | Only `default` & `static` methods (Java 8+) |
| Variables                    | Normal variables allowed                | Only `public static final` (constants)    |
| Multiple inheritance?        | No — only one parent                    | Yes — class can implement many            |
| Keyword                      | `abstract class`                        | `interface`                               |
| How to use                   | `extends`                               | `implements`                              |
| Real-life analogy            | Half-built house                        | Just the rule poster                      |

## 6. Enum
**What is it?**  
A special type that lets a variable have **only one value** from a fixed list of choices.  
Much safer than using numbers or strings.

**Real-life example**  
Days of the week: only MONDAY, TUESDAY, WEDNESDAY… (no one can write “Funday” by mistake)

**Real company example**  
Order status: PENDING, SHIPPED, DELIVERED, CANCELLED  
Used in **Amazon**, **Flipkart**, **Uber**

**Key points**
- Values in **UPPER_CASE** by convention
- You **cannot** create new values
- You **cannot** do `new EnumName()`
- Very safe — prevents mistakes




## 7. Annotations

Annotations are like metadata tags we put on code using @ symbol. They give extra information to compilers, frameworks, or tools without changing the actual logic — for example @Override, @Deprecated, or Spring's @Autowired.


What is annotation?
Small tags (start with @) that add extra information to code (classes, methods, variables)



Do they change how code runs?
No — they are just metadata. Other tools/frameworks read them.


Where can we put them?
Above classes, methods, fields, parameters, even other annotations
Built-in annotations (most asked):
@Override
@Deprecated
@SuppressWarnings
@FunctionalInterface



Custom annotation (you can make your own)

Javaimport java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)           // can only be put on methods
@Retention(RetentionPolicy.RUNTIME)   // can be read while program is running
public @interface MyImportantMethod {
    String author() default "Unknown";
    int priority() default 1;
}


Real-life example + company usage .
Real-life example:
Think of @Test in JUnit — it tells the testing tool "run this method as a test case". Without it, the method is ignored.


**Real company example**  
`@Override`, `@Autowired`, `@Test` — used in **every modern Java project** (**Netflix**, **Amazon**, **Google**)

### Most Common Annotations Table

| Annotation          | Simple Meaning                                   | Real-life Sticker Meaning                       | Real Company Example                     |
|---------------------|--------------------------------------------------|--------------------------------------------------|------------------------------------------|
| `@Override`         | I’m replacing parent’s method                    | “I’m copying mom’s dance perfectly!”            | Almost every class (**Google**)          |
| `@Deprecated`       | This is old — don’t use it                       | “Old toy — use new one”                         | Old `Date` class (**every project**)     |
| `@SuppressWarnings` | Ignore small warnings here                       | “Don’t tell me about tiny mistakes”             | Old libraries (**Netflix**)              |
| `@Test`             | This is a test — run it!                         | “This is a test question — check it!”           | Unit tests (**Spotify**, **Google**)     |
| `@Autowired`        | Spring — give me the object I need               | “Magic helper — bring me the toy!”              | Spring Boot apps (**Amazon**, **Netflix**) |




# ----------------TYPES OF INTERFACES -------------------


# Types of Interfaces in Java


1) Normal Interface :

 Definition (easy to remember):
A normal interface is a rule book that can have zero or more abstract methods. It can also have default methods and static methods (since Java 8).
Key Points:

Can have abstract methods (no body)
Can have default methods (with body – optional to override)
Can have static methods (called using interface name)
Classes use implements to follow it
Most common type

 Real-life example: List interface (has add(), remove(), size() etc.)  



2) Functional Interface / Single Abstract Method :

   Definition (easy to remember):
An interface with exactly one abstract method. It is made for lambda expressions and method references.
Key Points:

Must have exactly 1 abstract method
Can have any number of default + static methods
Usually marked with @FunctionalInterface (optional but recommended)
Enables short lambda syntax

 Real-life example: Runnable, Comparator, Predicate
Used by: Almost every modern Java application (Streams, Spring, Android)


3) Market Interface : 

Definition (easy to remember):
An empty interface with zero methods. It acts like a tag or label that says “this class has a special ability”.
Key Points:

No methods at all (completely empty)
Used to give a special permission or signal to JVM / framework
No code to implement — just implements it
Very old style, but still important

Real built-in examples:

java.io.Serializable
java.lang.Cloneable
java.rmi.Remote

Real-life example: Putting a "This package is fragile" sticker on a box — the sticker itself does nothing, but delivery people treat it differently.





This table explains the different types of interfaces in Java in a simple way.

| Type of Interface        | Number of Abstract Methods | Special Feature                                   | Example                               | Used with Lambda? |
|--------------------------|----------------------------|--------------------------------------------------|---------------------------------------|-------------------|
| Normal Interface         | 0 or more                  | Can have default & static methods                | List, Map, Animal                     | No                |
| Functional Interface     | Exactly 1                  | Works with lambda expressions                    | Runnable, Comparator, Predicate       | Yes               |
| Marker Interface         | 0                          | Acts as a tag / label for the JVM                | Serializable, Cloneable               | No                |



# Types of Errors in Java

This table explains common types of errors in Java with simple examples.

| Type of Error   | When it Happens     | Does Program Compile? | Does Program Run? | Example                          |
|-----------------|---------------------|------------------------|-------------------|----------------------------------|
| Syntax Error    | While writing code  | No                     | No                | Missing `;` or `{`               |
| Logical Error   | While running       | Yes                    | Yes (wrong result)| `2 + 2` calculated as `22`        |
| Runtime Error   | While running       | Yes                    | Program crashes   | Divide by zero, file not found   |

## Notes
- **Syntax errors** are caught by the compiler.
- **Logical errors** are hardest to find because code runs.
- **Runtime errors** occur due to unexpected situations.



Exceptions  ->

handle exceptions in Java

We don't want the whole program to crash and stop like a broken bike.
We want to handle it nicely — show a message, fix it if possible, or at least clean up and stop safely.
Java gives us 4 main tools to do this:

 1) try-catch
2) finally
3) throw
4) throws


1. try-catch – The most important one

 When you try to open a photo on your phone but the file is missing → app shows "Photo not found" instead of crashing.


Company example: Amazon shows "Item is out of stock" instead of crashing when you add something unavailable.

code  :

public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;           // This will cause exception
            System.out.println(result);
        }
        catch (ArithmeticException e) {   // We catch only this type
            System.out.println("Cannot divide by zero! Please check.");
        }

        System.out.println("Program continues...");
    }
}



2)  finally –  finally runs always — whether exception happened or not.
Used to clean up (close files, connections, etc.)


code : 

public class Main {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);   // This will cause exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index!");
        }
        finally {
            System.out.println("This always runs – cleaning up now...");
        }

        System.out.println("End of program");
    }
}


3)  throw – You created and threw the exception yourself.

code :

public class Main {
    
public static void checkage(int age) {
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

4) throws 


You are writing a program that reads a number from the user (using Scanner).
But what if the user types letters instead of numbers?
Java will throw InputMismatchException (which is a checked exception in some cases, but we’ll handle it nicely).
We will use throws to say:
“This method might cause a problem — the caller must handle it.”

code :

import java.util.Scanner;

public class Main {

    // This method says: "I might throw InputMismatchException"
    // So anyone who calls me MUST use try-catch


    static void getUserAge() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();   // ← this line can throw exception if user types "twenty"
        
        System.out.println("Your age is: " + age);
    }

    public static void main(String[] args) {

        try {
            getUserAge();   // calling the risky method
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number for age!");
        }
        finally {
            System.out.println("Thank you for using the program.");
        }

        System.out.println("Program ends safely.");
    }
}



# Scanner vs BufferedReader in Java

This table compares `Scanner` and `BufferedReader` for input handling in Java.

| Feature                     | Scanner                                   | BufferedReader                          |
|----------------------------|--------------------------------------------|------------------------------------------|
| Easy to use?               | Very easy                                  | A little more code                       |
| Speed                      | Good for small input                       | Faster for large input                  |
| Reads numbers directly?    | Yes (`nextInt()`, `nextDouble()`)          | No – read `String` then parse            |
| Handles spaces well?       | `nextLine()` yes, `next()` no              | Yes (always reads full line)             |
| Needs exception handling?  | No (unchecked exceptions)                  | Yes (`IOException` – checked)            |
| Most used by freshers?     | Yes                                        | Sometimes in advanced problems           |

## Notes
- Use **Scanner** for simple programs and beginners.
- Use **BufferedReader** for fast input and competitive programming.




Common Scanner methods:

nextLine()  → full sentence (with spaces)
next()     → one word (stops at space)
nextInt()  → integer number
nextDouble() → decimal number
nextBoolean() → true/false



# Threads

A thread is the smallest unit of work that can be scheduled and run  by the computer .

# multi threading -> doing many things at the same time .



# Java Thread Important Methods

| Method            | What it does (Simple)                                      | Example Use                                      |
|-------------------|------------------------------------------------------------|--------------------------------------------------|
| start()           | Starts a new thread and internally calls run()             | Always call this to begin execution              |
| run()             | Contains the task code that the thread executes            | Write your business logic inside this method     |
| sleep(millis)     | Pauses the current thread for given milliseconds           | Add delay between printing numbers               |
| join()            | Makes one thread wait until another thread finishes        | Main thread waits for child thread to complete   |
| setName()         | Assigns a name to the thread                               | Helps in debugging multiple threads              |
| getName()         | Returns the name of the thread                             | Print which thread is executing                  |
| currentThread()   | Returns the currently running thread                       | Thread.currentThread().getName()                 |




race condition -> synchronization in java 


A race condition occurs when multiple threads access and modify shared data concurrently, leading to inconsistent results. Synchronization in Java ensures that only one thread at a time can access a critical section, preventing race conditions.





# states of threads 



State,Meaning (simple),How it happens,Can we start thread again?
NEW,Born but not started,After new Thread(),Yes
RUNNABLE,Working or ready to work,After start(),—
BLOCKED,Waiting for lock (synchronized),Trying to enter synchronized block,—
WAITING,Waiting forever for signal,"wait(), join(), park()",—
TIMED_WAITING,Waiting for limited time,"sleep(), wait(millis), join(millis)",—
TERMINATED,Job done or died,run() finished or exception,No





Collection API 



# Java Collection Framework Quick Guide

| Interface | Common Classes | When to Use It | Example Use Case |
|------------|----------------|----------------|------------------|
| List | ArrayList, LinkedList, Vector | When you need ordered elements, allow duplicates, and want fast add/get operations | List of top 10 movies |
| Set | HashSet, LinkedHashSet, TreeSet | When you want only unique items (no duplicates allowed) | Unique email IDs in newsletter subscribers |
| Queue | PriorityQueue, LinkedList, ArrayDeque | When you need FIFO (First-In-First-Out) or priority-based processing | Tasks in a printer queue |
| Map | HashMap, LinkedHashMap, TreeMap | When you need to store data in key-value pairs | Student ID → Marks |



Collection 
  
   1) list 
            1) arraylist 
            2) linkedlist

    2) Queue
        1) Dequeue
    
    3) Set
       1) Hashset
        

    2) Map 
       1) HashMap



Comparator vs Comparable 


# Comparable vs Comparator in Java

Sorting is used to arrange objects in a specific order (like marks, names, price, etc.).

Java provides two ways to sort objects:
- Comparable → Object defines its own natural order.
- Comparator → External class defines sorting rules.

---

## 📌 Difference Table

| Feature | Comparable | Comparator |
|----------|------------|------------|
| Interface | `Comparable<T>` | `Comparator<T>` |
| Main Method | `compareTo(T o)` | `compare(T o1, T o2)` |
| Where Defined | Inside the same class | Separate class / anonymous class / lambda |
| Sorting Rules | Only one natural order | Multiple sorting orders possible |
| Modify Existing Class? | No (cannot modify built-in classes like `String`, `Integer`) | Yes (can create external logic) |
| Used In | `Collections.sort(list)` | `Collections.sort(list, comparator)` |
| Keyword Used | `implements Comparable<Student>` | `implements Comparator<Student>` |

---------------------------------------------


# ⏱ Time & Space Complexity

Java uses **TimSort** internally for sorting.

Time Complexity:
- Best Case: O(n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

Space Complexity:
- O(n) (uses temporary arrays internally)

---

# 🏢 Real-World Usage

Used in:
- Amazon → Sort products by rating, price
- Flipkart → Sort by popularity
- Swiggy → Sort restaurants by distance

Comparable → When there is one default sorting rule  
Comparator → When multiple sorting options are needed  

---

# 🎯 Summary

- Comparable → Natural sorting (inside class)
- Comparator → Custom sorting (outside class)
- Collections.sort() uses Comparable automatically
- Collections.sort(list, comparator) uses custom rule
