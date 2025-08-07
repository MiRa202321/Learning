import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] a={
        {1,2,15},
        {56,8,4},
        {8,5,7}
};
int x= sc.nextInt();
        System.out.println(find(a,x));
        System.out.println(Arrays.toString(findarr(a,x)));
        System.out.println(findmax(a));
    }

    static boolean find(int[][] a, int x){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==x) return true;
            }
        }
        return false;
    }

    static int[] findarr(int[][] a, int x){

        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                if(a[row][col]==x) return new int[] {row,col};  //return index
            }
        }
       return new int[]{-1,-1};
    }



    static int findmax(int[][] a){
int max= Integer.MIN_VALUE;
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                if(a[row][col]>max) max= a[row][col];
            }
        }
        return max;
    }
}
