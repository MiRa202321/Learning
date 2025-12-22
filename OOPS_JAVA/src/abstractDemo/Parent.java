package abstractDemo;

public abstract class Parent {
    static int age;
    final int val;

    public Parent(int age) {
        this.age = age;
        val = 54654;
    }

//    abstract Parent();  can't make a constructor abstract

    static void hello(){
        System.out.println("hye");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract  void career ();
    abstract void partner();
    //Every child class must override the abstract methods
}
