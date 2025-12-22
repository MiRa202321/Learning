package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(31);
        son.career();
        son.normal(); // non-static method can be called using child's obj

        Parent d= new Daughter(23);
        d.career();

//        Parent mom = new Parent() ;   Can't create objects of abstract class

        Parent.hello();   // static method in parent class
//        Parent.normal(); // if static
    }
}
