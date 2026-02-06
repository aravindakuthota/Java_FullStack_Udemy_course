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