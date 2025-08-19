package singleton;

public class Singleton {
//    private int num=4;
   private Singleton(){
        //can be used only in this class
    }

    private static Singleton instance; // not depenent on the objct

   public  static Singleton getInstance(){
       //check whether 1 obj is created
       if(instance== null){
           instance= new Singleton();
       }
       return instance;
   }
}
