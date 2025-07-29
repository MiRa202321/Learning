import java.util.Arrays;

public class Overload {
    public static void main(String[] args) {
//fun(52);
//fun("Mohit");
demo(1,56,42,84,74);
    }
//    static void  fun(int a){
//        System.out.println("First "+a);
//    }
//    static void fun(String k){
//        System.out.println("Second "+k);


        static void  demo(int ...v){
            System.out.println(Arrays.toString(v));
        }
        static void demo(String ...name){
            System.out.println(Arrays.toString(name));
    }
}
