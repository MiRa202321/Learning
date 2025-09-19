package properties.inheritance;

public class Box {
   // private double l;
    double l;
    double h;
    double w;
//    double weight;

static void greeting(){
    System.out.println("hey I am in Box class.");
}

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
//        super();  //  refers to Object class
        this.h =  side;
        this.l =  side;
        this.w =  side;
    }

    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.h =  h;
        this.l =  l;
        this.w = w;
    }

//passing object
    Box(Box old){
        this.h =  old.h;
        this.l =  old.l;
        this.w = old.w;
    }


    public void info(){
        System.out.println("Running function");
    }
}

