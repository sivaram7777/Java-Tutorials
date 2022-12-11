import java.util.*;
public class DoWhile_with_BreakStatement_Example {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n;
        do {
            System.out.println("Enter the number : ");
            n = sc.nextInt();
            if (n%10 ==0){
                System.out.println("Invalid number; Enter a valid number");
                break;
            }
            System.out.println("The number you have entered is : ");
            System.out.println(n);
        } while(n>0);

        /* int n;
        while(n>0){ // Error will arouse since 'n' has not been initialized
            System.out.println("Enter the number : ");
            n = sc.nextInt();
            if (n%10 ==0){
                System.out.println("Invalid number; Enter a valid number");
                break;
            }
            System.out.println("The number you have entered is : ");
            System.out.println(n);
        } */
    }
}
