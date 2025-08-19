package staticExample;

public class Human {
  int age;
  String name;
  int salary;
  boolean married;
  static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        //whenever a new human is created, increment by 1
        Human.population+=1;  //static var are referenced using class name by convention
    }
}
