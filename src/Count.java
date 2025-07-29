import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Enter number to be counted in "+n);
        byte b= sc.nextByte();
        int d=0;
        int cnt =0;
        while(n>0){
            d= n%10;
            if(d== b) cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}
