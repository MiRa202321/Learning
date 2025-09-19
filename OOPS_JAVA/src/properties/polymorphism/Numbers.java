package properties.polymorphism;

public class Numbers {
    double sum(int a, int b){
        return a + b;
    }

    double sum(double a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        //number of parameters
        return a + b + c;
    }

    void sum(int a, String b){
        //order of data type of  ref var, also diff data type
    }

    void sum (String a, int b){

    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,3);  //passing int, but double is called; Java automatically converts int -> double: Automatic Casting
        obj.sum(5,7,3);  // at compile time, it knows which method to run
    }


}
