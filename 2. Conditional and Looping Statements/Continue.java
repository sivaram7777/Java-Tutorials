/* import java.util.*;
public class Continue {
    public static void main (String args[]){
        for (int i = 1; i<=10; i++){
            if (i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
} */

/* import java.util.*;
public class Continue {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            if (i%10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}  */


import java.util.*;
public class Continue {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter the number : ");
            n = sc.nextInt();
            if (n%10 == 0) {
                continue;
            }
            System.out.println("The entered number is : ");
            System.out.println(n);
        }while(n>0);
    }
} 