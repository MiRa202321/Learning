public class Floor {
    public static void main(String[] args) {
        int[] a={2,3,5,9,14,16,18};
        int target=1;

        System.out.println(floor(a,target));

    }
    //ceiling returns the num which is >= target
    static int floor(int[] a, int t){
        int start=0;
        int end= a.length -1;

        while(start<=end){
            int mid= start + ((end-start)/2);

//            if(t<a[0]) return -1;  //no need of the condition, end will return -1 automatically

            if (a[mid]<t) start=mid+1;

            else if(a[mid]>t)end=mid-1;

            else return mid;


        }
        return end;
    }
}
