public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
//        int target=0;
        System.out.println(findPivot(a));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if no pivot - array isn't rotated: just do BS
        if (pivot == -1) {
            return bin(nums, target, 0, nums.length - 1);
        }


        // if pivot found, then we have two ASC arrays
        if (nums[pivot] == target) return pivot;

        if (target >= nums[0]) {
            return bin(nums, target, 0, pivot - 1);
        }
        return bin(nums, target, pivot + 1, nums.length - 1);
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



        // finding pivot with duplicates

//    static int findPivot ( int[] a){
//        int start = 0;
//        int end = a.length - 1;
//
//        while(start<=end) {
//            int mid = start + (end - start) / 2;
//
//            //cases
//
//            //case1:
//            if (mid < end && a[mid] > a[mid + 1]) return mid;
//
//            //case 2:
//            if (mid > start && a[mid] < a[mid - 1]) return mid - 1;
//
//            //case 3: will fail since  start=mid=end
////            if (a[mid] <= a[start]) {
////                end = mid - 1;
////            } else {
////                start = mid + 1;
////            }
//
//
//            if(a[mid]==a[start] && a[mid]==a[end])
//            {
//                //skip duplicates
//
//                if(a[start]>a[start+1]) return start;
//                start++;
//
//                if (a[end]<a[end-1]) return end-1;
//                end--;
//
//                //what if these ele were pivot??
//            }
//
//            //left is sorted and pivot is in right
//            else if(a[start]< a[mid] || a[start] == a[mid] && a[mid]>a[end]) start=mid+1;
//
//            else end=mid-1;
//        }
//        return -1;
//    }
//
//





        static int bin ( int[] a, int t, int start, int end){

            while (start <= end) {
                int mid = start + ((end - start) / 2);


                if (a[mid] < t) start = mid + 1;

                else if (a[mid] > t) end = mid - 1;

                else return mid;


            }
            return -1;
        }
    }
