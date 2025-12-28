package generics.comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student siya = new Student(12,84.24F);
        Student  rahul= new Student(10,94.56F);
        Student  arpit= new Student(1,91.50F);
        Student  karan= new Student(8,74.54F);
        Student  sachin= new Student(11,54.56F);

    Student[] list = {siya, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks);  //ascending order
////                return - (int) (o1.marks - o2.marks);  //descending order
//            }
//        });

        Arrays.sort(list, (o1, o2) -> {
            return (int) (o1.marks - o2.marks);  //ascending order
//                return - (int) (o1.marks - o2.marks);  //descending order
        });   //lambda functions

        System.out.println(Arrays.toString(list));



//    if(siya.compareTo(rahul) < 0){// Java confused, since two params:rollno and marks, for the Student class obj hence which one to compare.
//        System.out.println("Rahul has more marks");  //Rahul has more marks
//        System.out.println(siya.compareTo(rahul));   //-10
//    }
    }
}
