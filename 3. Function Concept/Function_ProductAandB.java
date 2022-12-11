import java.util.*;
public class Function_ProductAandB {
    public static int product(int a, int b){
        int product = a*b;
        System.out.println("The Product of A and B is: " + product);
        return product;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter A:");
            int a = sc.nextInt();
            System.out.println("Enter B:");
            int b = sc.nextInt();
            product(a,b);
        }
    }

