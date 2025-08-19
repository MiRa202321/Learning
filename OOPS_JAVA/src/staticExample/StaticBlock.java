package staticExample;

//this is a demo to show initialization of static var
public class StaticBlock
{
static int a=4;
static int b;


// how to initialize the static var? Using Static Block

     static {
         System.out.println("I am in static block");
         //WIll only run once, when the first obj is created
//        i.e when the class is loaded for th first time
//         a=6;
         b=a*5;
     }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);

        StaticBlock obj2= new StaticBlock();
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);
    }

}
