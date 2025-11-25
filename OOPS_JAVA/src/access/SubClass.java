package access;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(26,"nnfdjd");
       int n= obj.num;
        System.out.println(obj instanceof SubClass); //true
        System.out.println(obj instanceof Object); //true
    }
}
