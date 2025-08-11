public class MinIndexMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(search(mountainArr,target));
    }

   static int search(int[] nums, int target){
        int peak=findPeakElement(nums);

        int firstHalf= bin(nums, target,0,peak);
        if(firstHalf != -1){
            return firstHalf;
        }
        //search in second half
        return bin(nums, target,peak+1,nums.length-1);
    }
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end= nums.length -1;

        while(start< end){
            int mid= start+(end-start)/2;

            if(nums[mid]<nums[mid+1])  //increasing part
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        // at every point of time, s and e have the best possible ans at that time
        // and if only one ans remains then that is the ans.
        return start;
    }


    static int bin(int[] a, int t,int start, int end){
//        int start=0;
//        int end= a.length -1;

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
