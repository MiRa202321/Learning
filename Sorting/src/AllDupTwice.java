import java.util.ArrayList;
import java.util.List;

public class AllDupTwice {

    public List<Integer> findDuplicates(int[] nums) {

        int i=0;
        while(i<nums.length){
            int corr= nums[i]-1;
            if( nums[i] != nums[corr])  swap(nums,i,corr);
            else{
               i++;
            }
        }
        //just find missing nums
        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }

            //since ans can be of variable length, hence using list
        }
        return ans;
    }
    void swap(int[] a, int first, int second){
        int temp= a[first];
        a[first]=a[second];
        a[second]= temp;
    }
}
