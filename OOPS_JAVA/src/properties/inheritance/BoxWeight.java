package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other){  // no error, since child can access parent class 4
        // and the type of ref var determines the access, here BoxWeight has access to vars of Box
        super(other);
        weight= other.weight;
    }


    BoxWeight(double side, double weight){
        super(side);
        this.weight= weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        //what is this?   call the parent class constructor
        //used to initalize values in parent class.
        this.weight = weight;


//        System.out.println(super.weight);   same ref var name , to refer to base class's var
    }

//    @Override
    static void greeting(){
        System.out.println("I am in Box Weigth");
    }
}