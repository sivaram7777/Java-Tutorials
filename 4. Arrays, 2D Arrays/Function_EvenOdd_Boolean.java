import java.util.*;
public class Function_EvenOdd_Boolean {
    public static boolean isPrime (int n) {
        if (n%2 == 0) {
            return true;
    } else {
        return false;
    }
}
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
