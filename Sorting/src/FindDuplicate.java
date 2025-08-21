public class FindDuplicate {
    public static void main(String[] args) {
        int[] a= {1,3,2,2};
        System.out.println( findDuplicate(a));
    }

        public static int findDuplicate(int[] nums) {
            int i=0;
            while(i<nums.length){

                if(nums[i]!=i+1){
                    int corr= nums[i]-1;
                    if( nums[i] != nums[corr])
                        swap(nums,i,corr);
                    else{
                        return nums[i];
                    }
                }
                else{
                    i++;
                }
            }

            return -1;
        }

       static void swap(int[] a,int f, int s){
            int temp=a[f];
            a[f]=a[s];
            a[s]=temp;
        }
    }

