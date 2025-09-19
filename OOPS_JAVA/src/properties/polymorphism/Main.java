package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
//        Square square = new Square();
        Shapes square = new Square();

        square.area();

//        shape.area();  //I am in Shapes
//        square.area(); //Area is side * side.
//        circle.area(); //Area is 3.14 * radius * radius.


    }
}
