package enumExamples;

public class Basic {
    enum Week implements A {
        //these are enum constants
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // each one is: public, static and final
        // since it's final, we can't create child enums
        // type is Week

        Week(){
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hy how are you?");
        }
        // this is not public or protected
        // only private or default
        // why? we don't want to create new objects

        //internally: public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day : Week.values()) {
//            System.out.println(day.ordinal());
//        }

//        Constructor called forMonday
//        Constructor called forTuesday
//        Constructor called forWednesday
//        Constructor called forThursday
//        Constructor called forFriday
//        Constructor called forSaturday
//        Constructor called forSunday

        week.hello();

        System.out.println(Week.valueOf("Monday"));  // returns enum constant 
    }
}