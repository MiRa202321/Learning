package introduction;

public class WrapperEg {
    public static void main(String[] args) {
        int a=10;// primitves
        int b= 20;
        Integer num= 45; //object
        Integer num2=50;

//        swap(a,b);
//        System.out.println(a+" "+b);


        swap(num,num2); // still not swapping??  Because Wrapper classes are 'final'
        System.out.println(num+" "+num2);


        final int BONUS= 45;
//        BONUS=41; // CAN'T MODIFY


        final A kk= new A("Rahi");
        kk.name="NewName";

        //when non- primitive is final, you can't re assign it.
//        kk= new A("new object");

        A obj;

        for (int i=0;i<100000000;i++){
            obj= new A("Random");
//            obj.finalize();// can't do this manually in Java.
        }
    }


    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }


    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class A{
    final int num=10;  //must initialize

    String name;


    public A(String name) {  //Alt+ Fn +Insert  : to automatically generate constructor
        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
