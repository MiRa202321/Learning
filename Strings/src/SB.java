import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch= (char) ('a'+i);
            builder.append(ch); // no new object is created
            // changing the builder object


        }
        System.out.println(builder.toString());

        System.out.println(builder.reverse());
//        System.out.println(builder.capacity());


        String st= "Cheching";
        StringBuilder test = new StringBuilder();
        test.append(st);
        System.out.println(test.toString()); //Cheching
        test.replace(4,5,"k");
        System.out.println(test.toString()); //Checking
        test.reverse();
        System.out.println(test.toString());  //gnikcehC

    }
}
