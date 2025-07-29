import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 45, 89,56, 3};
        int a = 10, b = 56;
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
        System.out.println( maxele(arr));
         reverse(arr);
         System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] a, int i1, int i2){   //Swapp as per index
        int temp= a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
    }

    static int maxele(int[] a){   //max elelment
        int m=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }

    static void swapp(int a, int b){ // not useful
      int temp;
      temp=a;
      a=b;
      b=temp;
    }// won't work since no change in original value; copy of ref. var. passed


    static void reverse(int[] a){ //reverse array using swap function
        int s=0;
        int e=a.length-1;   //two pointer
        while(s<e){
            swap(a, s, e);
            s++;
            e--;
        }
    }

}