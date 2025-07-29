import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int rev=0;
        int d=0;

        while(n>0){
            d=n%10;
            rev= rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
    }
}
