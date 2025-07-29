public class Shadowing {
    static int x=56; //this is shadowed on line 5
    public static void main(String[] args) {
        System.out.println(x);//56
        int x=95;
        System.out.println(x);//95    //lower level is overriding the upper level
        fun();
    }

   static void fun(){
       System.out.println(x);//56
   }
}
