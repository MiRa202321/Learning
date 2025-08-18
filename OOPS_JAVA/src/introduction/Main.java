package introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // any data type/ data structure that stores 5 roll nums
        // an integer array of size 5
        int[] rollno = new int[5];

        //store 5 names
        // String[] name= new String[5];

        //some data type to include data of 5 students: roll no, name and marks (for each student)

        int[] rn = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        //some sort of data structure where every single ele contains all the three properties, mentioned above
        // here comes Classes and OOP

        Student[] students = new Student[5]; // class contains all the three properties
//        introduction.Student rashmi; // just declaration; ref var in stack memory
//
//        rashmi= new introduction.Student();

      //  System.out.println(Arrays.toString(students)); // Before initialization and after declaration, object by default points to 'null'
        //TO CREATE OBJECTS: use 'new' keyword.



        Student st = new Student();
//        System.out.println(st); //prints some random value: same every time
//        System.out.println("st's marks= "+st.marks);// prints the default value
        //primitives return th default value before initialization
//        st.rn= 56;
//        st.chl='g';
//        st.marks=41; //pdated is printed
//        st.name="Radhika";
//int sal=4;
//        System.out.println(st.rn);
//        System.out.println(st.name);
//        System.out.println(st.marks);
//        System.out.println(st.chl);
//        System.out.println(st.sal); can't refer to some other property not defined in class introduction.Student

//st.changeName("Nemo");
//st.greet();

Student st2= new Student(14,"Kanha",51);   //constructor overloading- polymorphism


//
//        System.out.println(st2.rn);
//        System.out.println(st2.name);
//        System.out.println(st2.marks);
//        System.out.println(st2.chl);
//
//st2.greet();

//        introduction.Student random= new introduction.Student(st2);
//        System.out.println(random.name);
//
//        introduction.Student random2= new introduction.Student();
//        System.out.println(random2.name);


        Student one= new Student();
        Student two= one;   // pointing to the same object as one
        one.name="Soemthing";
        System.out.println(two.name);
    }


}

//create a class
class Student{
    int rn;
    String name;
    float marks=51;
    char chl;

    // we need a way to initialize the value of above properties for each object:  one word-  'this'

    //'this' keyword is used to access to the ref var of each new object created and furthermore assign some value using the  dot(.) keyword.
    Student(){
//        this.rn=7;
//        this.name="R";
//        this.marks=45;


//        calling another constructor from constructor
        this(5,"Hema",51.4f);
    }

//    introduction.Student st2= new introduction.Student(14,"Kanha",51);
//    here, this will be replaced with st2
//
    Student(int rn, String st, float f){
        this.rn=rn;       //must use 'this'
        this.name=st;
        this.marks=f;
    }

    Student(Student other){    //consturctor initializing object using other object
        other.name=this.name;
        other.marks=this.marks;
        other.rn=this.rn;
    }

    void greet(){
        System.out.println("Hello, My name is: "+ name);
    }

    void changeName(String nm){
        name=nm;
    }
}