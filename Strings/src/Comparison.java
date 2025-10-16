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
