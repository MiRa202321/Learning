import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
         String st= "Rashmi";
         char ch='f';
       // System.out.println(foundChar(st,ch));

        System.out.println(Arrays.toString(st.toCharArray()));
        System.out.println( foundChar2(st,ch));
    }

//    static boolean foundChar(String s, char c){
//        if(s.length()==0) return false;
//
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==c) return true;
//        }
//        return false;
//    }


    static boolean foundChar2(String s, char c){
        if(s.length()==0) return false;

        for(char ch: s.toCharArray()){
            if(c==ch) return true;
        }

        return false;
    }
}
