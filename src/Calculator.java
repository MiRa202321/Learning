import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter operation");
        char op= sc.next().trim().charAt(0);


        if(op=='+' || op== '-'|| op== '/' || op == '*' || op== '%'){
            System.out.println("Enter two nums");
            int a= sc.nextInt();
            int b= sc.nextInt();
            int ans=0;


            while(true){
                if (op == '+') {
                    ans= a+b;
                    break;
                }
                if (op == '-') {
                    ans= a-b;
                    break;
                }
                if (op == '*') {
                    ans= a*b;
                    break;
                }
                if (op == '%') {
                    ans= a%b;
                    break;
                }
                if (op == '/') {
                    if(b!=0) ans=( int) a/b;
                    break;
                }

            }
            System.out.println(ans);
        }
        else{
            System.out.println("Invalid Operation");
        }

    }
}
