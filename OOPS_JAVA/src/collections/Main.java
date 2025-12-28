package collections;

import java.util.*;
// Oracle DOCS Collections: https://docs.oracle.com/javase/8/docs/technotes/guides/collections/
//Enums: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(24);
        list2.add(41);
        list2.add(12);
        list2.add(74);

        System.out.println(list2);  // printing linked list

        List<Integer> vect = new Vector<>();
        vect.add(41);
        vect.add(4);
        vect.add(1);
        vect.add(416);

        System.out.println(vect);



         }
}
