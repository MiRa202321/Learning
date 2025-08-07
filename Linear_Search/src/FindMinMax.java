public class FindMinMax {
    public static void main(String[] args) {
      int  a[]={48 ,5,4,26,14,3};
        int n=a.length;
        System.out.println(findMin(a,n));
        System.out.println(findMax(a,n));

        int start=1;
        int end=n;
        findMinMaxRange(a,n,start,end);
    }
    static int findMin(int[] a,int n){
         int min=a[0];
         for (int i=1;i<n;i++){
             if(a[i]<min) min=a[i];
         }
         return min;
    }

    static int findMax(int[] a,int n){
        int max=a[0];
        for (int i=1;i<n;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    static void findMinMaxRange(int[] a,int n,int s,int e){
        int min=a[s];
        int max=a[s];
        for (int i=s+1;i<e;i++){
            if(a[i]<min) min=a[i];
            if(a[i]>max) max=a[i];
        }
        System.out.println("Max " +max+ " and Min: " +min);
    }

}
