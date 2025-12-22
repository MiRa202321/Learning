package interfaces;

public class Main {
    public static void main(String[] args) {

//        // Dynamic method dispatch: which method to run, it's actually determining at runtime
////        Car car = new Car();
//
//        Engine car= new Car();  //what you access: LHS, which one of those versions to access depends on: RHS
//        // hence can't access var a in Class Car; but can access price in interface Engine.
//        // here the object is of car type, hence  the  al methods can be accessed which the Car class needs to override
////        car.a;// can't access
//
//        int price = Engine.price;
////        System.out.println(Engine.price);
//
////        car.acc();
////        car.start();
////        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();  // I stop engine like a normal car.
//        // An issue: We want to stop song but it stops engine
//        // Sol: We can create separate class for all the interfaces



        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        // without creating a new obj, we're able to change a part
//        without creating a new car, we're able to change a part of it, here, engine
        car.start();

    }
}
