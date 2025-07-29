import java.util.Scanner;

public class largest {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();


    int m = Math.max(c, Math.max(a, b));
    System.out.println(m);
}
}
