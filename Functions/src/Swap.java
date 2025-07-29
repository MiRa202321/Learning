public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b= 20;



        swap(a,b);
        System.out.println("Printing " +a + " and "+b); // not swapped, because copy value of ref var is passed
    }

    static void swap(int a, int b){
        int temp=0; //cannot change the object
        temp=a;
        a=b;
        b=temp;
    }
}
