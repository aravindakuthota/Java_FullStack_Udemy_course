import java.util.*;

class stu {
    String name;
    int marks;

    stu(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}


class MarksComparator implements Comparator<stu> {
    public int compare(stu s1, stu s2) {
        return Integer.compare(s1.marks, s2.marks); // ascending order of marks
    }
}


class NameComparator implements Comparator<stu> {
    public int compare(stu s1, stu s2) {
        return s1.name.compareTo(s2.name); // ascending order of names
    }
}




public class ComparatorExample {
    public static void main(String[] args) {


        List<stu> Students = new ArrayList<>();

        Students.add(new stu("Aravind", 85));
        Students.add(new stu("Priya", 92));
        Students.add(new stu("Ravi", 78));

        Collections.sort(Students, new MarksComparator()); // sort by marks
        System.out.println("Sorted by marks: " + Students);

        Collections.sort(Students, new NameComparator()); // sort by name
        System.out.println("Sorted by name: " + Students);

        
    }
}
