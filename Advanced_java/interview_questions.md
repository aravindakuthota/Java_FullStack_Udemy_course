# Java Interview Quick Revision – Super Short Answers

## Abstract Class & Interface – Super Short Interview Answer

**Q: Why can't we do `new Toy()` when `Toy` is an interface or abstract class?**

**Answer (super short):**  
Because interfaces and abstract classes are not complete — they are like **blueprints** or **rule books**.  
You can't create or use a blueprint directly.  
You can only create real objects from **concrete classes** (normal classes) that finish all the promises / fill all the missing parts.

---

## Enum in Java – Interview Questions & Answers

**Q1. What is an enum in Java?**  
**Ans:** Enum is a special type that allows a variable to have only one value from a fixed set of constants. It makes code safer and more readable than using int or String constants.

**Q2. Why should we prefer enum over constants like `public static final int / String`?**  
**Ans:** Enums are type-safe, prevent invalid values, give better readability, support methods/fields, and avoid typos or magic numbers.

**Q3. Can we create an object of an enum using new keyword?**  
**Ans:** No. You cannot do `new EnumName()`. Enums are implicitly final and have private constructors.

**Q4. What methods are automatically available in every enum?**  
**Ans:**
- `name()` → String name of constant  
- `ordinal()` → int position (starts from 0)  
- `values()` → static method returning array of all constants  
- `valueOf(String)` → static method to get enum from name

**Q5. Can enums have constructors, fields, and methods?**  
**Ans:** Yes. Enums are real classes. We can add private constructors, instance fields, and methods.

**Example:**
```java
enum TrafficLight {
    RED("Stop", 30),
    YELLOW("Wait", 5),
    GREEN("Go", 60);

    private final String action;
    private final int seconds;

    TrafficLight(String action, int seconds) {
        this.action = action;
        this.seconds = seconds;
    }

    public String getAction() {
        return action;
    }

    public int getSeconds() {
        return seconds;
    }
}



Q6. What is the use of ordinal() method? Is it safe to use it for logic?
Ans: ordinal() returns the position (0,1,2…).
It’s not safe for business logic because order can change if someone adds/removes constants. Use fields or methods instead.


Q7. How to loop through all enum values?
Ans:
Javafor (TrafficLight light : TrafficLight.values()) {
    System.out.println(light + " means " + light.getAction());
}


Q8. Can an enum implement an interface?
Ans: Yes. Enums can implement interfaces (very common in real projects).
Example:
Javainterface Describable {
    String getDescription();
}

enum Season implements Describable {
    SUMMER("Hot and sunny"),
    WINTER("Cold and snowy");

    private final String desc;

    Season(String desc) {
        this.desc = desc;
    }

    public String getDescription() {
        return desc;
    }
}


Q9. What is EnumSet and EnumMap?
Ans:

EnumSet: Very fast Set optimized only for enum values
EnumMap: Very fast Map where key is enum type

Both are much more efficient than HashSet/HashMap when using enums as elements/keys.


Q10. Real-life example + company usage
Ans:
Example: Order status in e-commerce
enum OrderStatus { PLACED, CONFIRMED, SHIPPED, DELIVERED, CANCELLED, RETURNED }
Used by: Amazon, Flipkart, Swiggy — almost every company uses enums for status, payment modes, user roles, etc.

/////////////// ANNOTATONS -----------------

Q1. What is an annotation in Java?
Answer (easy version):
Annotations are like metadata tags we put on code using @ symbol. They give extra information to compilers, frameworks, or tools without changing the actual logic — for example @Override, @Deprecated, or Spring's @Autowired.



Real-life example:

Like putting a "Do not use – old!" sticker on an old toy so everyone knows not to play with it.


Company example: Spring Boot uses @RestController annotation to tell "this class handles web requests".


Q2. What are the most common built-in annotations in Java?
Answer:


@Override → "I'm changing a method from parent class"
@Deprecated → "This is old — don't use it anymore"
@SuppressWarnings → "Ignore warnings here"
@FunctionalInterface → "This interface has exactly one abstract method"

Short tip for interview:
These are built into Java (since JDK). Everyone expects you to know at least @Override and @Deprecated.



Q3. What does @Override do? Why is it useful?
Answer:
It tells the compiler: "I am trying to change (override) a method from the parent class."
If you make a mistake (wrong name, wrong parameters), compiler gives error immediately — very helpful!

Example:
Javaclass Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {                  // correct
        System.out.println("Woof!");
    }

    // @Override
    // void sounds() {              // ERROR! No such method in parent
    //     System.out.println("Wrong");
    // }
}


Q4. What are the different retention policies for annotations?
Answer (simple):
Retention = "How long does the sticky note stay?"
Three types:

SOURCE → only in source code (disappears after compilation) — e.g. @Override
CLASS → stays in .class file (but not read at runtime) — default
RUNTIME → stays even when program is running (can be read using reflection) — e.g. @Autowired in Spring

Interview tip: Say RUNTIME is most important for frameworks like Spring.
Q5. What is the difference between @Override, @Deprecated, and @SuppressWarnings?






AnnotationPurpose (simple)When compiler shows something?@OverrideMust override parent methodError if wrong@DeprecatedMark something old — don't useWarning when used@SuppressWarningsHide warnings (e.g. "unchecked")Nothing — hides warnings
Q6. Can we create our own custom annotation? How?
Answer: Yes!
Simple example:
Javaimport java.lang.annotation.*;

@Target(ElementType.METHOD)           // only on methods
@Retention(RetentionPolicy.RUNTIME)   // readable at runtime
public @interface MyTest {
    String message() default "Hello";
    int priority() default 1;
}
Use it:
Javaclass Example {
    @MyTest(message = "Important test")
    void doSomething() {
        System.out.println("Doing...");
    }
}
Time & Space complexity: Not applicable (just metadata)
Q7. What are meta-annotations?
Answer:
Annotations that are used on other annotations.
Common ones:

@Target → where can this annotation be used? (method, class, field…)
@Retention → how long does it live?
@Inherited → can children get it?
@Documented → show in JavaDoc?

Q8. How do annotations work in Spring Boot? (very common question)
Answer:
Spring reads annotations at runtime (RUNTIME retention) and does magic:

@Component, @Service, @Repository, @Controller → "Make this a Spring bean"
@Autowired → "Put the right object here automatically"
@GetMapping, @PostMapping → "Call this method when URL is hit"

Real-life example:
In Spring Boot, @SpringBootApplication is a big sticker that says "Start Spring magic automatically".
Company example: Amazon, Netflix, Google — all use Spring Boot annotations heavily in microservices.
Q9. What is @FunctionalInterface? Why do we need it?
Answer:
It says: "This interface MUST have exactly one abstract method."
Helps when using lambda expressions — compiler checks for you.
Example:
Java@FunctionalInterface
interface MyTask {
    void run();           // only one method → good
    // void walk();       // error if uncommented
}
Q10. Do annotations affect performance?
Answer:
Normally no — they are just notes.
But if you read them at runtime using reflection (like Spring does), there is a small cost — but it's usually not noticeable.



Q1. What is an interface in Java?
Answer:
An interface is like a rule book or contract. It tells what methods a class must have, but it doesn’t tell how to write them.
A class that follows (implements) an interface has to write code for all those methods.
Simple example:
Javainterface Animal {
    void eat();
    void sleep();
}
Real-life analogy: Like saying every phone must have “call” and “message” buttons, but how they work inside can be different.
Q2. How do you create an interface and use it?
Answer:
We use the keyword interface to create it.
A class uses implements keyword to follow it.
Example:
Javainterface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying with wings");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.fly();
    }
}
Q3. Can we create an object of an interface?
Answer:
No, we cannot create an object directly using new for an interface.
Wrong:
JavaFlyable f = new Flyable();  // Error!
Correct way:
We create object of the class that implements it.
Q4. What is the difference between abstract class and interface?
Answer (very simple version for freshers):



































FeatureAbstract ClassInterfaceMethods with bodyYesNo (except default & static)VariablesCan have normal variablesOnly constants (public static final)Multiple inheritanceNo (only one parent)Yes (can implement many)Keywordabstract classinterfaceUse whenCommon code + some must-doPure rules / contract
Real-life:
Abstract class → half-built house
Interface → just the rule poster
Q5. What is a functional interface?
Answer:
A functional interface is an interface that has exactly one abstract method.
It can have default and static methods also.
We use it with lambda expressions (Java 8+).
Example:
Java@FunctionalInterface
interface Greeting {
    void sayHello(String name);   // only one abstract method
}
Usage:
JavaGreeting g = name -> System.out.println("Hi " + name);
g.sayHello("Aravind");
Q6. Name some built-in functional interfaces in Java.
Answer:
Common ones freshers should know:

Runnable → run()
Comparator → compare()
Predicate → test()
Consumer → accept()
Supplier → get()
Function → apply()

All these are used a lot with lambda and streams.
Q7. What is a marker interface? Give example.
Answer:
A marker interface is an empty interface (no methods).
It acts like a tag or label to tell JVM or framework that the class has some special ability.
Examples:

Serializable (can be converted to bytes)
Cloneable (can be copied)
Remote (for RMI)

Simple:
Javaclass Student implements Serializable {
    String name;
    int age;
}
Q8. Can a class implement more than one interface?
Answer:
Yes — this is called multiple inheritance (allowed only through interfaces).
Example:
Javainterface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flying");
    }
    public void swim() {
        System.out.println("Duck swimming");
    }
}
Q9. What happens if a class implements an interface but doesn’t implement all methods?
Answer:
It will give a compilation error unless the class is also declared as abstract.
Correct ways:

Implement all methods
Or make class abstract

Q10. What are default methods in interface? Why were they added?
Answer:
Default methods are methods in interface that have body (code inside {}).
They were added in Java 8 so that old interfaces can add new methods without breaking existing classes.
Example:
Javainterface Vehicle {
    void start();

    default void horn() {
        System.out.println("Beep beep!");
    }
}
Old classes that implement Vehicle don’t need to write horn() — they get it automatically.
Real-life example:
Java added default method forEach() in Iterable interface in Java 8 — old code didn’t break.





# Java Exceptions 


## 1. What is an Exception in Java?

An **exception** is an unexpected problem or error that happens **while the program is running (runtime)**.  
It **stops the normal flow** of the program.

### Types:
- **Checked Exceptions**
  - Must be handled  
  - Examples: `IOException`, `SQLException`
- **Unchecked Exceptions**
  - Not forced to handle  
  - Examples: `NullPointerException`, `ArithmeticException`

**Real-life example:**  
- Dividing by zero  
- Opening a file that doesn’t exist  

---

## 2. What are the different types of exceptions in Java?

### Categories:

###  Checked Exceptions
- Checked at **compile time**
- Must be handled using `try-catch` or `throws`

Examples:
- `IOException`
- `FileNotFoundException`
- `SQLException`

### Unchecked Exceptions
- Not checked at compile time
- Usually programming mistakes

Examples:
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `ArithmeticException`

### ❌ Error (Very serious – not recommended to catch)
Examples:
- `OutOfMemoryError`
- `StackOverflowError`

---

## 3. Difference between Exception and Error

| Feature            | Exception                              | Error                              |
|--------------------|----------------------------------------|------------------------------------|
| Recoverable?       | Usually yes (can be handled)           | Usually no (serious problem)       |
| Checked/Unchecked  | Both exist                             | Always unchecked                   |
| Examples           | IOException, NullPointerException      | OutOfMemoryError, StackOverflowError |
| Should we handle?  | Yes (good practice)                    | No (very rare)                     |

**Real-life example:**
- Exception → You forgot your umbrella (you can manage)
- Error → House caught fire (very big problem)

---

## 4. What is the purpose of try-catch block?

- `try` → contains risky code
- `catch` → handles the exception (message, logging, alternate action)
- Prevents program from crashing suddenly

### Example:
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
