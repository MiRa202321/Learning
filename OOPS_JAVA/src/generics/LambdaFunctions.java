package generics;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

// Refer Oracle DOCS: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arr.add(i+1);
//        }
//       a.forEach((item) -> System.out.println(item * 2));   //single line       });
        Consumer<Integer> fun = (item) -> System.out.println(item *2);  //Implementation provided here
        arr.forEach(fun);

//        Sum sum = Integer::sum;
//        Sum sum = (a,b) -> a+b;

        Operations sum = (a,b) -> a+b;
        Operations prod = (a,b) -> a*b;
        Operations sub = (a,b) -> a-b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println( myCalc.operate(5,3,sum));
        System.out.println( myCalc.operate(5,3,prod));
        System.out.println( myCalc.operate(5,3,sub));

    }

    int operate(int a, int b, Operations op){
        return op.operation(a,b);
    }
}


interface Operations{  // Absttract method
    int operation(int a, int b);
}