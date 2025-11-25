 package singleton;

import access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(26,"nnfdjd");
//       int n= obj.num;
    }
}

//Subclass's subclass can access protected data member
class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(26,"nnfdjd");
        int n= obj.num;
    }
}




class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(26,"nnfdjd");
//        int n= obj.num;
    }
}
