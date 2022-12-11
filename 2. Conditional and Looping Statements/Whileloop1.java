/* //Print numbers from 1 to 10
import java.util.*;
public class Whileloop1 {
    public static void main(String args[]) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
    }
} */

//Print numbers from 1 to n
import java.util.*;
public class Whileloop1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n) {
            System.out.println(i);
            i++;
        }
    }
}