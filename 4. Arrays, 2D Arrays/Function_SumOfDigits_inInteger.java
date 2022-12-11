import java.util.*;
public class Function_SumOfDigits_inInteger {
    public static int sum(int n) {
        int sum = 0;
        while (n>0) {
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        System.out.println("The sum is : "+ sum);
        return sum;
    }

        public static void main(String args[]) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();
            sum(n);
        }
    }

