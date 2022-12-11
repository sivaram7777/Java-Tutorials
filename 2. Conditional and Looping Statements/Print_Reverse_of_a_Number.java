import java.util.*;
public class Print_Reverse_of_a_Number {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to be reversed : ");
        int n = sc.nextInt();

        System.out.println("The reversed number is : ");
        while(n>0){
            int lastdigit = n%10;
            n=n/10;
            System.out.print(lastdigit);
        }
}
}