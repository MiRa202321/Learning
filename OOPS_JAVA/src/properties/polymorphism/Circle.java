package properties.polymorphism;

public class Circle extends Shapes {

    //this will run when obj of Circle class is created
    //hence it is overriding the parent method
   @Override //this is called annoation   check for overriding
    void area (){
        System.out.println("Area is 3.14 * radius * radius.");
    }
}
