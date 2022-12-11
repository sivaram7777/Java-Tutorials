import java.util.*;
public class String_SubString {

    public static String Substring (String str, int si, int ei) {
        String Substring = "";
        for(int i=si;i<ei;i++) {
            Substring += str.charAt(i);
        }
        return Substring;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Phrase : ");
        String str = sc.nextLine();
        System.out.println(Substring(str, 1, 6));

        //Inbuilt Function in Java for Substring;
        System.out.println(str.substring(1, 6));
    }
    
}
