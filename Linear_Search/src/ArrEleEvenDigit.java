public class ArrEleEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 34564, 2, 6, 7849};
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (evenDig(nums[i])) cnt++;
        }
        System.out.println(cnt);
    }

    static boolean evenDig(int a){
        int c=0;
        while(a>0){
            c++;
            a=a/10;
        }
        if(c%2==0) return true;
        return false;
    }
}
