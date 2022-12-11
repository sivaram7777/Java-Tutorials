import java.util.*;
public class String_ConvertToUpperCase {
    public static String ConvertToUppercase (String str) {
        //String Builder
        StringBuilder sb = new StringBuilder ("");

        //Converting the first character to upper case
        char ch = Character.toUpperCase(str.charAt(0)); // Character.toUpperCase - Convert 'a' to 'A';
        sb.append(ch);

        //Converting the character after 'empty (blank) space' to upper case
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        //To convert StringBuilder to String
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "hi iam sivaram";
        System.out.println(ConvertToUppercase(str));

    }
}
