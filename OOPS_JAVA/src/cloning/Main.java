package cloning;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human betu = new Human(26,"Rashmi");
//        Human twin = new Human(betu);// creating a copy of betu

        Human twin = (Human) betu.clone();
        System.out.println(twin.age+" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));  //[100, 66, 7, 4, 3, 2]

       // This is shallow copy
        System.out.println(Arrays.toString(betu.arr)); // [100, 66, 7, 4, 3, 2] the original object too is modified

//        After deep copy, betu won't be changed
    }
}
