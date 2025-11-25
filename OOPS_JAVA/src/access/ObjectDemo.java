package access;

public class ObjectDemo {

    int num;
//    int val;
   float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
//        this.val = 49;
        this.gpa=gpa;
    }


    @Override
    public int hashCode() {
//        return num;
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }


    //Done if(ob == ob2){  //which variable to compare
    //            System.out.println("ob is equal to ob2");
    //        }
//    @Override
//    public String toString() {
//        return super.toString();
//    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }


    public static void main(String[] args) {
        ObjectDemo ob= new ObjectDemo(45, 48.4f);
        System.out.println(ob.hashCode() );

//        ObjectDemo ob2= new ObjectDemo(12);
//        System.out.println(ob2.hashCode() );

//        ObjectDemo ob2= ob;
//        System.out.println(ob2.hashCode());


        ObjectDemo ob2= new ObjectDemo(45, 45.2f);
        if(ob == ob2){  //which variable to compare
            System.out.println("ob is equal to ob2");
        }

        if(ob.equals(ob2)){  //which variable to compare
            System.out.println("ob is equal to ob2");
        }

        System.out.println(ob.getClass().getName() );
    }
}
