import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        String name="rita";
        System.out.println(a);
        {
            int c=56;
            a=456; //can not initialize but can change the value, since this is the original var, pointing to the oject
            System.out.println(a);
            name= "Sita"; //new obj but same ref var
        }
        int c=65;
       // c=85; //canot use it outside the block
        System.out.println(a);
        System.out.println(name);// now  the ref var points to a new obj
        System.out.println(c);
    }
}
