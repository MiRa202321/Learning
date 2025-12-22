package interfaces;

public class Car implements Engine,Brake, Media{

    // it overrides all the methods, does not matter which one it's overriding, its overriding, ew know that
    // how to do, the child class will care or which class overrides

    int a=54;

    @Override
    public void brake() {
        System.out.println("I brake like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car.");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car.");
    }
}
