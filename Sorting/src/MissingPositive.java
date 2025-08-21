import java.util.ArrayList;
import java.util.List;

public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corr= nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[corr])  swap(nums,i,corr);
            else{
                i++;
            }
        }
        //just find missing nums

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
              return j+1;
            }

            //since ans can be of variable length, hence using list
        }
        return nums.length+1;
    }
    void swap(int[] a, int first, int second){
        int temp= a[first];
        a[first]=a[second];
        a[second]= temp;
    }
}
