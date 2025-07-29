import java.util.Scanner;

public class FIbonaccci {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;  int b=1;

        int temp=0;

        if(n==0) System.out.println(a);
        if(n==1 ) System.out.println(b);

        while(n>1){     //since started counting from

            temp=a+b;
            a=b;
            b=temp;
            n--;
        }
        System.out.println(temp);

    }

    //or we can use cnt;
    /*
    while(cnt< =n){
    perform updation
    }
    print temp;
     */

}
