package staticExample;

//class Test{
//   static String name;
//
//    public Test(String name) {
//        this.name = name;
//    }

 public class InnerClasses {
    static class Test{
        //It is independent of the obj of class InnerClasses
        String name;

        public Test(String name) {
            this.name = name;
        } //dependent on the outer class, so every instance of InnerClass will have their own Test class.

        @Override
        public String toString() {
            return name;
        }
    }

     public static void main(String[] args) {
        Test a= new Test("Rashmi"); // this can't be refrence by a static context
         Test b= new Test("Ram");
// these are objects of the class Test




//
//         System.out.println(a.name);
//         System.out.println(b.name);
         //both shows Ram, since name is declared static


         System.out.println(a); // Prints "Rashmi" and not some random hashcode(i.e. default toString() method not called)
         //toString() called when printing obj
     }
}


