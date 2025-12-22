package abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
//        this.age = age;   if no constructor in Parent class
    }

    @Override
    void career() {
        System.out.println("I will be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }


}

