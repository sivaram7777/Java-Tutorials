import java.util.*;
public class Function_MultiplicationTable {
    public static int Multiply (int n) {
        int multiply = 1;
        for(int i =1; i<=n; i++) {
        multiply = i*n;
        System.out.println(i + "*" + n + "=" + multiply);
    }
    return multiply;
}
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        System.out.println(Multiply(n));

    }
}