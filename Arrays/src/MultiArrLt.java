import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrLt {
    public static void main(String[] args) {


Scanner sc= new Scanner(System.in);

ArrayList<ArrayList<Integer>> list= new ArrayList<>();

//Initialize
    for(int i=0;i<3;i++){  //3 lists
        list.add(new ArrayList<>());
    }


    //Add element

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }


        System.out.println(list);

}
}
