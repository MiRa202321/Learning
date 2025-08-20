import java.util.ArrayList;
import java.util.List;

public class AllMissingNums {
    //Lt 448
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correctIndex= nums[i]-1;
                if(i==correctIndex) i++;
                else{
                    swap(nums,i,correctIndex);
                }
            }
            //just find missing nums
            List<Integer> ans= new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] != j+1){
                    ans.add(i+1);
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
}
