import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
fun(1,6,78,95,444,'a');  //stores ASCII code of 'a'
        // this fun can be called using zero or more args
        }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}

