

// mutable -> change  ( String bulder && string buffer)
// immutable -> cannot change -> by default 


// String buffer is thread safe and 
// String builder is not thread safe 



public class Stringproblem {

    public static void main(String[] args) {

  StringBuffer sb = new StringBuffer("Aravind");
  // give buffer size of 16gb

  sb.append(" kumar");


    sb.deleteCharAt(2);

  
    System.out.println(sb);
    }
}


