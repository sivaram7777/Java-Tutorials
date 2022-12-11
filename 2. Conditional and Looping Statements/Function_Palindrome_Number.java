import java.util.*;
public class Function_Palindrome_Number {
    public static boolean isPalindrome (int n) {
        int palindrome = n; //"n" is copied to a new variable "palindrome" ;

        //Reversing a number
        int reverse = 0;
        
        while (palindrome>0) {
            int lastdigit = palindrome%10;
            reverse = reverse*10 + lastdigit;
            palindrome = palindrome/10;
        }
        System.out.println("The reversed digit is:" + reverse);

        //Checking for Palindrome
        if (n == reverse) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();

            if (isPalindrome(n)) {
                System.out.println("The number " + n + " is a Palindrome number");
            } else {
                System.out.println("The number " + n + " is not a Palindrome number");
            }
        }
    }
