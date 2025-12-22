package abstractDemo;

public class Son extends Parent{

    public Son(int age)
    {
        super(age);
        //this.age = age;  if no constructor in Parent class
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I will be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love pepper pots");
    }


}

