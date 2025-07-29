import java.util.Scanner;

public class Changevalue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a= {1,2,6,84};

        change(a);
        System.out.println(a[0]);

    }

    static void change(int[] nums){
        nums[0]=56;// making change in the object via ref var, then value will change.
    }
}
