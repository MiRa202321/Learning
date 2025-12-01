import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Rashmi Mishra";
        System.out.println(Arrays.toString(name.toCharArray()));  //[R, a, s, h, m, i,  , M, i, s, h, r, a]
        System.out.println(name.toLowerCase());  //rashmi mishra
        System.out.println(name);  //Rashmi Mishra
        System.out.println(name.indexOf('h'));  // 3
        System.out.println("     yes     ".strip());  //whitespaces are removed
        System.out.println(Arrays.toString(name.split(" ")));  //wherever space, split it :  [Rashmi, Mishra]
        //for  String name = "Rashmi Mishra hello Strings in Java"; [Rashmi, Mishra, hello, Strings, in, Java]
    }
}
