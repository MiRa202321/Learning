public class BInarySearchDESC {
    public static void main(String[] args) {
        int[] a={748,55,40,16,6,5,-1};
        int target=5;

        System.out.println(bin(a,target));

    }
    static int bin(int[] a, int t){
        int start=0;
        int end= a.length -1;

        while(start<=end){
            int mid= start + ((end-start)/2);



            if (a[mid]>t) start=mid+1;

            else if(a[mid]<t)end=mid-1;

            else return mid;


        }
        return -1;
    }
}
