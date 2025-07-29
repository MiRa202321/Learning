import java.util.Arrays;

public class PassFun {
    public static void main(String[] args) {
        int[] arr= {56,2,14,58,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[2]=28;
    }
}
