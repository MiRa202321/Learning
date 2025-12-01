public class Palin {
    public static void main(String[] args) {
//        String s = "abcba";  //true
//        String s="";
        String s= "abc";  //false
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String st){
       if(st.length() ==0 || st == null) return true;
        st = st.toLowerCase();

        for (int i= 0; i<= st.length() / 2 ;i++){
            char start = st.charAt(i);
            char end = st.charAt(st.length()-1 -i);

            if(start != end) return false;
        }
        return true;

    }
}
