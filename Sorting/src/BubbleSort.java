import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {
    public static void main(String[] args) {
//        int[] a={-3,-5,-98,0,708};  works for empty array or array with single value
        int[] a={3,1,5,4,2};
        bubbleSort(a,a.length);
        System.out.printf(Arrays.toString(a));


        }



    static void bubbleSort(int[] a, int n){
        boolean swap;
        //run the steps  of sorting n-1 times using i asa counter
        for(int i=0;i<n;i++){
            // for each step/pass, max item will come at the last respective index

            // do not include the already sorted ele from last hence, j<n-i
            swap=false;

            for(int j=1;j<n-i;j++){
                //swap if the curr item is smaller than the previous item
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap=true;
                }
            }

            //if you do not swap for a particular value of i, that means the arry is sorted
            if(!swap) break;
        }
    }
}