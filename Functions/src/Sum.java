import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
       int ans= sum();
        System.out.println(ans);
        System.out.println(greet());

        int s3= sum2(56,45);
        System.out.println("Second sum is "+s3);
    }
    static int sum(){
        Scanner sc= new Scanner(System.in);
        int a,b, s;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
//        System.out.println("The sum of " +a+ " and "+ b+ " is "+s);

        return  s;
    }

//returning string value
    static String greet(){
        return "how are you?";

        // unreachable statement below return.
    }


    //pas the value of numbers when you are calling in main

    static int sum2(int a, int b){
        return a+b;
    }
}


