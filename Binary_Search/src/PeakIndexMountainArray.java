public class PeakIndexMountainArray {
    //Lt 162,852
    public static void main(String[] args) {
        int[] nums={1,2,3,5,4,1};
        System.out.println(findPeakElement(nums)); //prints index
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
    }