import  java.util.*;
public class Function_String_Reverse {

    public static String reverse (String str) {
        String rev = "";
        for(int i=str.length()-1; i>=0;i--) {
            rev += str.charAt(i);
        }
        return rev;
        }
    
    public static void main(String[] args) {
        String str = "Hello world";

        //StringBuilder method
        //(Since Strings are immutable in java, we need to use StringBuilder);
        StringBuilder sb  = new StringBuilder(str);
        System.out.println(sb.reverse());

        //Function - String Concatenation
        System.out.println(reverse(str));

        //Charcter Array Method
        String rev = "";
        char ch[] = str.toCharArray();
        for(int i=str.length()-1; i>=0;i--) {
        rev += ch[i];
    }
    System.out.println(rev);
}
}