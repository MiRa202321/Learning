package singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj= new Singleton();
//        System.out.println(obj.num); // can't access since it is declared private

        Singleton obj = Singleton.getInstance();  // new obj created

        // all other obj created after this point to the same obj
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        //all 3 ref var are pointing to just one obj

    }
}
