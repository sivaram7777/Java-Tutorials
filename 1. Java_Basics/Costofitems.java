import java.util.*;
public class Costofitems {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil :");
        int a = sc.nextInt();
        System.out.println("Enter the cost of pen :");
        int $ = sc.nextInt();
        System.out.println("Enter the cost of eraser :");
        int c = sc.nextInt();

        System.out.println("The total price is : " + ((a+$+c) + 0.18*(a+$+c)));
        //double Total = ((a+$+c) + 0.18*(a+$+c));
        //System.out.println(Total);
    }
    
}
