public class OrderAgnosticBS {  //WE AREN'T AWARE THE ORDER IN WHICH THE ARRAY IS SORTED
    public static void main(String[] args) {
        //asc
//        int[] a={-48,-5,0,1,56,58,77};
//        int target=77;

        //desc
        int[] a={748,55,40,16,6,5,-1};
        int target=5;


        System.out.println(bin(a,target));


    }
    static int bin(int[] a, int t){
        int start=0;
        int end= a.length -1;

        boolean isAsc= a[start]<=a[end];
        while(start<=end){
            int mid= start + ((end-start)/2);

            if(a[mid]==t) return mid;

            if(isAsc) {
                if (a[mid] < t) start = mid + 1;
                else  end = mid - 1;

            }
            else{
                if (a[mid] > t) start = mid + 1;
                else  end = mid - 1;
            }

        }
        return -1;
    }
}
