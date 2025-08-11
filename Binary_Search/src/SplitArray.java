public class SplitArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
int start=0;
int end=0;

for(int i=0;i< nums.length;i++){
    start=Math.max(start,nums[i]);  // largest element of the array- Lowe limit
    end+=nums[i]; //sum of all values- Upper Limit
}

//binary search

        while(start<end){
            //try for middle as potential ans

            int mid= start+(end-start)/2;

            //calsulate how many pieces you can divide this array in with max sum
            int sum=0;
            int piece=1;

            for (int num: nums){
                if(sum+ num >mid){
                    sum=num;
                    piece++;
                }
                else {
                    sum+=num;
                }
            }

            if(piece>k){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }

        return end; //or start, since both are equal
    }
}
