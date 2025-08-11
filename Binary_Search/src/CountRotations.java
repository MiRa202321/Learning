public class CountRotations {
    public static void main(String[] args) {
        int[] a = { 1, 2,3,8,9};
        System.out.println(printCountRotations(a));
    }

    private static int printCountRotations(int[] a) {
   int pivot= findPivot(a);
   return pivot+1;
    }


    //this won't work with duplicate values
    static int findPivot ( int[] a){
        int start = 0;
        int end = a.length - 1;

        while(start<=end) {
            int mid = start + (end - start) / 2;

            //cases

            //case1:
            if (mid < end && a[mid] > a[mid + 1]) return mid;

            //case 2:
            if (mid > start && a[mid] < a[mid - 1]) return mid - 1;

            //case 3:
            if (a[mid] <= a[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }



//     finding pivot with duplicates

    static int findPivotwithduplicates ( int[] a){
        int start = 0;
        int end = a.length - 1;

        while(start<=end) {
            int mid = start + (end - start) / 2;

            //cases

            //case1:
            if (mid < end && a[mid] > a[mid + 1]) return mid;

            //case 2:
            if (mid > start && a[mid] < a[mid - 1]) return mid - 1;

            //case 3: will fail since  start=mid=end
//            if (a[mid] <= a[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }


            if(a[mid]==a[start] && a[mid]==a[end])
            {
                //skip duplicates

                if(a[start]>a[start+1]) return start;
                start++;

                if (a[end]<a[end-1]) return end-1;
                end--;

                //what if these ele were pivot??
            }

            //left is sorted and pivot is in right
            else if(a[start]< a[mid] || a[start] == a[mid] && a[mid]>a[end]) start=mid+1;

            else end=mid-1;
        }
        return -1;
    }
}
