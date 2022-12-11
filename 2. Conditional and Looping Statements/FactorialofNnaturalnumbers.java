import java.util.*;
public class FactorialofNnaturalnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int fact = 1;
        /* int i = 1;
        while(i<=n) {
            fact  = fact * i;
            i++;
        } */
        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}