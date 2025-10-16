public class Performance {
    public static void main(String[] args) {
        String s= "";
        for (int i=0; i< 26; i++){
            char ch= (char) ('a'+i); //new object is created everrytime
            /*
            *
            * */
            s=s+ ch;  // s+=ch;   prints the output in string
        }
        System.out.println(s);
    }
}
