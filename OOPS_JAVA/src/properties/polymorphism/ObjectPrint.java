package properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

//    @Override
//    public toString() {
//        return "ObjectPrint" + "nums" +num + '}';
//    }
    public static void main(String[] args) {
ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);  // it will use toString() of Object class
    }
}
