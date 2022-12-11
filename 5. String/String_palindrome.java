import java.util.*;
public class String_palindrome {

    public static boolean isPalindrome (String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n= str.length();
                if (str.charAt(i) != str.charAt(n-1-i)) {
            return false;
                }
        }
    return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

        String s1="Sachin";  
        String s2="Sachin";  
        String s3="Ratan";  
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
    }  
    
    }


