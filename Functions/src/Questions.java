import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans= isPrime(n);
        boolean res=isArms(153);
        System.out.println(ans);
        System.out.println(res);

        for(int i=100;i<=1000;i++){
            if(isArms(i)) System.out.print(i+" ");
        }
    }

    static boolean isPrime(int n){
        if(n<= 1) return false;
        int c=2;
        while(c*c<= n){
            if(n%c==0) return false;
            c++;
        }
        return (c*c > n);
    }

    static boolean isArms(int b){
        int d;
        int k=b;
        int s=0;
        while(b>0){
            d=b%10;
            s+=(int)Math.pow(d,3);
            b/=10;
        }
        return (k==s);// returs true or false
    }
}
