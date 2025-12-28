package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,66,7,4,3,2};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }
//    public Object clone() throws CloneNotSupportedException {
//        //this is shallow copy
//        return super.clone();
//    }
@Override
    public Object clone() throws CloneNotSupportedException {
        //this is deep copy
        Human twin = (Human) super.clone();   // this is acctually shallow copy

    //make a deep copy
    twin.arr = new int[twin.arr.length];
    for (int i = 0; i < twin.arr.length; i++) {
        twin.arr[i] = this.arr[i];
    }
//    System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
    return twin;
    }

}
