public class Ceiling {
    public static void main(String[] args) {
        int[] a={2,3,5,9,14,16,18};
        int target=15;

        System.out.println(ceil(a,target));


    }
    //ceiling returns the num which is >= target
    static int ceil(int[] a, int t){
        int start=0;
        int end= a.length -1;

        while(start<=end){
            int mid= start + ((end-start)/2);

            if(t>a[a.length -1]) return -1;

            if (a[mid]<t) start=mid+1;

            else if(a[mid]>t)end=mid-1;

            else return mid;


        }
        return start;
    }
}
