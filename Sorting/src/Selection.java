import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a={4,5,3,2,1};
        selectionSort(a);
        System.out.printf(Arrays.toString(a));
    }

    static void selectionSort(int[] a){
        for(int i=0;i< a.length;i++){
            int lastIndex= a.length-i-1;
            int maxIndex= getMaxIndex(a,0,lastIndex);
            swap(a,maxIndex, lastIndex);
        }
    }

    private static int getMaxIndex(int[] a, int start, int end){
        int max= start;

        for(int i=0;i<=end;i++){
            if(a[max]<a[i]){
                max= i;
            }
        }
        return max;
    }

    static void swap(int[] a, int first, int second){
        int temp= a[first];
        a[first]=a[second];
        a[second]= temp;
    }
}
