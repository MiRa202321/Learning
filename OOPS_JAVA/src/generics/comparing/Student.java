package generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  marks + " " + rollno;

    }

    @Override
    public int compareTo(@NotNull Student o) {
        return 0;
    }

//    @Override
//    public int compareTo(Student o) {
//        int diff = (int)(this.marks - o.marks);
//
//        //if diff == 0;means both are equal
//        //if diff < i: means o is bigger else o is smaller
//
//        return diff;
//    }


}
