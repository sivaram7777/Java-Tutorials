import java.util.*;
public class PatternPrinting_InvertedStar {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int line =1; line<=n; line ++) {                 //Outer loop = No Change
            for (int star = 1; star <= n-line+1; star++) {   //Inner loop = Change in Condition
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Alternate for Inner loop : 
for (int star =n; star>=line; star--) */