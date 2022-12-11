import java.util.*;
public class PrintLargestof3 {
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First Number : ");
        int a =sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int b =sc.nextInt();

        System.out.println("Enter the Third Number : ");
        int c =sc.nextInt();

        if ((a>=b) && (a>=c)) {
            System.out.println("A is the largest number");
        } else if (b>=c) {
            System.out.println("B is the largest number");
        } else {
            System.out.println("C is the largest number");
        }

    }
    }

