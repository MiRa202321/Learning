import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');  // adds ASCII value and prints the sum = 195

        System.out.println("a"+"b");  //concatenation

        System.out.println('a'+3);   // ASCII valu +3 = 100

        System.out.println((char)('a'+3));  // prints the character of ASCII value - 100:  d (Type casting)

        System.out.println("a"+10);  // when an integer added to string:
        // that integer will be converted to Integer wrapper class object: that will call .toString()
        // hence after few steps this becomes: "a"+"1"

        System.out.println("hira" + new ArrayList<>()); //hira[] : string concat with an empty array

        System.out.println("hira" + new Integer(85));  //hira85

//        System.out.println(new Integer(85) + new ArrayList<>());
        //Operator '+' cannot be applied to 'java.lang.Integer', 'java.util.ArrayList<java.lang.Object>

//        '+': defined only for primitives or for any group of complex groups of objects at least one of the object is Sting
//        then they are all type casted as string
        //Operator overloading not supported

    }
}
