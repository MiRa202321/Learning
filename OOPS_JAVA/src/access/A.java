package access;

public class A {

   //data members
//    private int num;    //can be accessed only from this file/class since -private
   protected int num;
    String name;
    int[] arr;

    public int getNum() {   //this method is public hence can be accessed from anywhere
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
