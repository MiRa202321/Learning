import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int corr = nums[i] - 1;
            if (nums[i] != nums[corr]) swap(nums, i, corr);
            else {
                i++;
            }
        }
        //just find missing nums

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
             return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1,-1};
    }

        void swap(int[] a, int first, int second){
            int temp= a[first];
            a[first]=a[second];
            a[second]= temp;
        }
}
