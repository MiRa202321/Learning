import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        for(int i=1;i<6;i++){
            System.out.println(i);
        }

//WHILE: don't know num of iterations
//        int i=1;
//        while(i<6){
//            System.out.println(i);
//            i++;
//        }
// do-while : atleast once
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<6);


        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
    }
}
