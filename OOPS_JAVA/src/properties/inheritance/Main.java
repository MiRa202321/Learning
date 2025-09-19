package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1= new Box(4.6,70,6);
//Box box2= new Box(box1);
//        System.out.println(box1.l +" "+ box1.w+" "+ box1.h) ;
//        System.out.println(box2.l +" "+ box2.w+" "+ box2.h) ;
//
//
//
//        BoxWeight box3= new BoxWeight();
//        BoxWeight box4= new BoxWeight(2,4,5,1);
//        System.out.println(box3.l+ " "+ box3.weight);

//
//Box box5= new BoxWeight();
//        System.out.println(box5.w);
//        System.out.println(box5.weight); //can't since the ref var can access only superclass members

        //there are many var in child and parent class
//        you are given access to vars that are in the ref type i.e. BoxWeight
//        hence, you should have access to weight var - in the boxWeigh class
//        this means, that the ones you are trying to access should be initialized
//        but here, when the object itself is of type parent class how will you call the constructor of child class


//downward classes have no idea about what is below,
// below classes know what classes are above
//        but above classes don't know what clases are below

//        BoxWeight box6= new Box(1,2,5,3);//  ERROR?  because ref var is of type child class




//        BoxPrize box= new BoxPrize(5,8,200);

      Box.greeting();

      Box box=  new BoxWeight();
      box.greeting(); 
    }
}
