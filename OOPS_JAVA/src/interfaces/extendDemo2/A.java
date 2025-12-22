package interfaces.extendDemo2;

public interface A {
    default void fun(){
        System.out.println("I am in A.");
    }

    //static method in interface should have a body
    //call via the interface name
    static void greeting(){
        System.out.println("Hey, i am static method.");
    }

    // no error even though this default method id not overriden
}
