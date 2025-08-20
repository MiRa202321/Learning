// copy a  class code and right click in the folder you want it and paste;
//that class is created automatically

class MissingNum{

    public static void main(String[] args) {
        int[] a={4,0,1,2};
        System.out.println(missingNumber(a));
    }
    //Lt 268
    public static int missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            }
            else{
                    i++;
                }
            }


            //search or first missing num
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j) return j;  //case 1
            }
            return nums.length;  //case 2
        }

        static void swap ( int[] a, int first, int second){
            int temp = a[first];
            a[first] = a[second];
            a[second] = temp;
        }
    }