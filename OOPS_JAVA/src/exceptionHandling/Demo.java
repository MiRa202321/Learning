package exceptionHandling;

public class Demo {
    public static void main(String[] args) {
        Main.divide(3,0);
//        Exception in thread "main" java.lang.ArithmeticException: Please do not divide by zero
//        at exceptionHandling.Main.divide(Main.java:22)
//        at exceptionHandling.Demo.main(Demo.java:5)
//
    }
}
