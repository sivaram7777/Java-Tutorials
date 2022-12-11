import java.util.*;
public class String_StringCompression {

    public static String StrCompress (String str) { 
        //Create a new String
        String newStr = "";
        for(int i=0;i<str.length();i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++;
            }
            System.out.println(i);
            //Add the respective Character(i) to the newStr;
            newStr = newStr + str.charAt(i);    

            //Convert the Counter variable to String; 
            //Add the respective Character(i) to the newStr;
            if(count>1) {
                newStr = newStr + count.toString(); 
        }
    }

    return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(StrCompress(str));
    }
}
