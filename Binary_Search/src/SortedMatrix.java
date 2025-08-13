import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
int[][] a={
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
        System.out.println(Arrays.toString(search(a,9)));
    }

    static int[] BS(int[][] m, int r, int cStart, int cEnd, int t){
        //which row you wanna search between columns provided
        //from which column to which column

        while(cStart<=cEnd){
            int mid= cStart+(cEnd-cStart)/2;
            if(m[r][mid] == t){
                return new int[] {r,mid};
            }
            if(m[r][mid] < t){
                cStart=mid+1;
            }
            else{
                cEnd= mid-1;
            }

        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] m, int t){
        int r=m.length;
        int c=m[0].length;

        if (r==1){
            return BS(m,0,0,c-1,t);
        }

        int rStart=0;
        int rEnd= r-1;
        int cMid= c/2;

        //run loop till 2 rows are remaining
        while (rStart<(rEnd-1)){
            //until this is true, it will have more than 2 rows

            int mid= rStart+(rEnd-rStart)/2;
            if (m[mid][cMid]==t){
                return new int[]{mid,cMid};
            }

            if(m[mid][cMid]<t){
                //ignore below row
                rStart=mid;
            }
            else {
                //ignore column above mid
                rEnd=mid;
            }
        }
        //now we have 2 rows remaining
        //check whether target is in col of 2 rows

        if (m[rStart][cMid]==t){//checking for start
            return new int[] {rStart, cMid};
        }

        if (m[rStart+1][cMid]==t){// checking for end
            return new int[] {rStart+1, cMid};
        }

        //Otherwise search in 1st half,
        if (t<=m[rStart][cMid-1]){
            return BS(m,rStart,0,cMid-1,t);
        }
        // search in 2nd half
        if (t>=m[rStart][cMid+1] && (t<=m[rStart][c-1]) ){
            return BS(m,rStart,cMid+1,c-1,t);
        }
        // search in 3rd half
        if (t<=m[rStart+1][cMid-1]){
            return BS(m,rStart+1,0,cMid-1,t);
        }
        // search in 4th half of array
      else{
            return BS(m,rStart+1,cMid+1,c-1,t);
        }


    }
}
