import jdk.dynalink.support.SimpleRelinkableCallSite;

public class Comparison {
    public static void main(String[] args) {
        String a= "Rashmi";
//        String b= "Rashmi";
        String c= a;
        System.out.println(a == c);
//        System.out.println(a == b );   //true



//        String a= new String("R");
//        String b= new String("R");
//        System.out.println(a == b );   //false
    }
}


// 1. == : checks if ref var are pointing to same object
// how to create a new object:
//                          String a = new String("Rashmi")
//                          String b = new String("Rashmi")  //creates obj outside the pool but in heap


//2. when only need to check va;ue:  st1.equals(st2)