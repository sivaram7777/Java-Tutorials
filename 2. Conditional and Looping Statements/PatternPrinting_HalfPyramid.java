import java.util.*;
public class PatternPrinting_HalfPyramid {
    public static void main(String ars[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
                System.out.println();
        }
    }
}
