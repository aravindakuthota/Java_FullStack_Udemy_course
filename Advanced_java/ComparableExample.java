//  Comparable – the object itself knows its natural order
// Comparator – someone else gives an extra rule for sorting

import java.util.*;
import java.util.Collections;

class S implements Comparable<S> {
    String name;
    int marks;

    S(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(S other) {
        return Integer.compare(other.marks, this.marks);  // descending marks
        // return this.marks - other.marks;  // ascending marks
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<S> students = new ArrayList<>();
        students.add(new S("Aravind", 85));
        students.add(new S("Priya", 92));
        students.add(new S("Ravi", 78));

        Collections.sort(students);   // uses compareTo automatically

        System.out.println(students);
       
    }
}