package properties.inheritance;

public class BoxPrize extends BoxWeight{

    double cost;

    BoxPrize(){
        super();
        this.cost = -1;
    }

    BoxPrize(BoxPrize other){
        super(other);
        this.cost= other.cost;
    }

    public BoxPrize(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrize(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
