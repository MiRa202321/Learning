import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           sum();
        }
    static void sum(){
            Scanner sc= new Scanner(System.in);
            int a,b, s;
            a=sc.nextInt();
            b=sc.nextInt();
s=a+b;
            System.out.println("The sum of " +a+ " and "+ b+ " is "+s);
        }
    }
