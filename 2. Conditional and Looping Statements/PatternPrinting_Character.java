import java.util.*;
public class PatternPrinting_Character {
    public static void main(String ars[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i =1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
            }
                System.out.println();
        }
    }
}
