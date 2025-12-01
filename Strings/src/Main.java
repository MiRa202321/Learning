//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //String - most commonly used class in java programming
        //every string an object

        String a = "Rashmi"; // this object is not modified
        System.out.println(a);
        a="Mishra";  // new object is created
        System.out.println(a);
    }
}

//String pool - a separate memory structure inside the heap; makes program optimised
// all  the similar values in pool aren't recreated again in the memory
// Immutability? for security(why?)