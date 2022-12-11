import java.util.*;
public class Fuction_BinomialCoefficient {

    public static int factN (int n) {
        int fact =1;
        for(int i=1; i<=n; i++) {
        fact = fact * i;
        }
        return fact;
    }

    public static int factR (int r) {
        int fact =1;
        for(int i=1; i<=r; i++) {
        fact = fact * i;
        }
        return fact;
    }

    public static int factNmr (int Nmr) {
        int fact =1;
        for(int i=1; i<=Nmr; i++) {
        fact = fact * i;
        }
        return fact;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter r :");
        int r = sc.nextInt();
        int Nmr = (n-r);
        int Bcft = (factN(n)/ (factR(r) * factNmr(Nmr)));
        System.out.println("The Binomial Coefficient is : "  + Bcft);


    }    
}
