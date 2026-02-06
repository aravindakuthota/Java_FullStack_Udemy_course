// exceptions are called run time errors


class Student {

    // these are instance variables they belong to class not method 
    int rolno ;
    String name;
    int marks ; 
}

public class demo {
public static void main(String[] args) {
   
   Student s1 = new Student();
   s1.rolno = 1;
   s1.name = "John";
   s1.marks = 90;


   Student s2 = new Student();
   s2.rolno = 2;
   s2.name = "Jane";
   s2.marks = 95;

Student students[] = new Student[3];
  students[0] = s1;
  students[1] = s2;

  for(int i =0; i<students.length;i++){
    Student student = students[i];
    if(student != null) {
    System.out.println(students[i].name + " :" +students[i].marks );
    }
  } 


//     int nums [] = new int[5];
// nums[0] = 1;
// nums[1] = 2;
// nums[2] = 3;
// nums[3] = 4;
// nums[4] = 5;


// for(int i = 0; i < nums.length; i++) {
//     System.out.println(nums[i]);

// }
}
}