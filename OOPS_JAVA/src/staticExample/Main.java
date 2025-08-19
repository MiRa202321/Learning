package staticExample;

import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        //no need to import files in same folder

//        Human rashi= new Human(22,"Rashi",10000,false);
//        Human rahi= new Human(42,"Rahi",15000,true);
        Human arim= new Human(32,"Arim",20000,true);

//        System.out.println(rashi.name);

        //Will work, but follow convention
//        System.out.println(rashi.population);
//        System.out.println(rahi.population);
//        System.out.println(arim.population);

        //Reference the static variables using class

//        System.out.println(Human.population);


        Main funn= new Main();
        funn.fun2();

    }

    //this is not dependent on object
    static void  fun(){
        Main ob= new Main();
        ob.greet();// without specifying the instance(obj), we can't use this here
    }

    //this is dependent on object
  void greet(){
        fun();  // can access static
       System.out.println("Non-static");
    }

    void fun2(){
        greet(); // not req instance here, since when running in main, an obj will be created for this non-static method
    }
    }

