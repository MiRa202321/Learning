import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //array of primitive
//        int[] arr= new int[5];
//
//        //to intitalize array we use loop(for)
//        for(int i=0; i< arr.length;i++){
//            arr[i]=sc.nextInt();
//        }



//        // pritning using loop
//        for(int i=0; i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//        for(int x: arr){
//            System.out.print(x+" ");
//        }


//        System.out.print(Arrays.toString(arr));  //best way to print



        //array of non-primitive/ objects

        String[] str= new String[5];
        for(int i=0; i< str.length;i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));

        }
}
