import java.util.Arrays;

public class FirstLastPos {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString( searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0]= search(nums,target,true);
        if(res[0]!=-1) {
            res[1] = search(nums, target, false);
        }
        return res;
    }

//returns the index value of target
  static  int search(int[] nums, int target, boolean firstIndex) {

        int[] res = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);


            if (nums[mid] < target) start = mid + 1;

            else if (nums[mid] > target) end = mid - 1;

            else {
                //potential ans is found
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}
