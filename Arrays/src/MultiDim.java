import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int[][] arr = new int[3][3];

        //input
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }

        //output
//        for(int row=0; row< arr.length;row++){
//            for (int col=0; col<arr[row].length; col++){
//                System.out.print( arr[row][col]+" ");
//            }
//            System.out.println();
//        }


//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        //enhanced for loop
//
//        for(int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }


//        for(int[] r: arr){
//            for(int c: r){
//                System.out.print(arr[r][c]+" ");
//            }
//            System.out.println();
//        }



        int[][]  arr= {
                {1 ,2 ,3},
                {4,6},
                {12, 9, 8, 5}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }




        }

}