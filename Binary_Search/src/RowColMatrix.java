import java.util.Arrays;

public class RowColMatrix { //array is sorted row as well as column wise

    public static void main(String[] args) {
        int[][] arr={
                {10,20,40},
                {11,25,34},
                {23,41,74}
        };

        System.out.println(Arrays.toString(search(arr,25)));
    }
    static int[] search(int[][] a,int t){
        int r=0;
        int c= a.length-1;

        while(r<a.length && c>=0){
            if(a[r][c]==t) {
                return new int[]{r,c};
            }

            if(a[r][c]<t){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

}
