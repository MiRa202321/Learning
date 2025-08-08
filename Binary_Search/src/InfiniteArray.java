public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        //  Link:   https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
        //start with box of size=2


        System.out.println( findRange(arr,target));
    }

    static int findRange(int[] a, int target){
        //find range
        int s=0;
        int e=1;

        //condition for it to lie in the range is : if target>end then obviously target is greater than e

        while(target>a[e]){
            int newStart=e+1;

            //double the box value
            //end= prev end+ sizeofbox*2

            e=e+(e-s+1);


            s=newStart;
        }
       return bin(a,target,s,e);

    }
    static int bin(int[] a, int t,int s, int e){
        int start=0;
        int end= a.length -1;

        while(start<=end){
            int mid= start + ((end-start)/2);



            if (a[mid]<t) start=mid+1;

            else if(a[mid]>t)end=mid-1;

            else return mid;


        }
        return -1;
    }
}
