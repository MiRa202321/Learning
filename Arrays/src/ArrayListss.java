import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListss {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //syntax
        ArrayList<Integer> list= new ArrayList<>();

        //Collection framework: java provides implementation  for stack, LL, HashMaps,etc
//
        list.add(54);
        list.add(55);
        list.add(54);
        list.add(56);
        list.add(844);


//        System.out.println(list);
//
//
//        System.out.println(list.contains(450));// false
//
//        list.set(1,23);
//        System.out.println(list);
//
//
//        list.remove(4);
//        System.out.println(list);



        //input

//        for(int i=0;i<5;i++){
//            list.add(sc.nextInt());
//        }
//
//        System.out.println(list);


        //Printing
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));;
        }

    }
}
