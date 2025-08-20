import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a={3,5,4,1,2,6};// must be in continuous order
        cyclicSort(a);
        System.out.printf(Arrays.toString(a));;
    }

    static void cyclicSort(int[] a){
       int i=0;
       while(i<a.length){
           int correctIndex= a[i]-1;
           if(i==correctIndex) i++;
           else{
               swap(a,i,correctIndex);
           }
       }
    }

    static void swap(int[] a, int first, int second){
        int temp= a[first];
        a[first]=a[second];
        a[second]= temp;
    }


//    static int[] cyclicSort(int[] a){  // just simply place the elements directly in their correct position
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i+1;
//        }
//        return a;
//    }
}
