package interfaces.extendDemo2;

public class Main implements A,B {

    // we need to update both the methods
    @Override
    public void greet() {

    }

//    private void greet() {
//  error, since it should be less restrictive
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }


}
