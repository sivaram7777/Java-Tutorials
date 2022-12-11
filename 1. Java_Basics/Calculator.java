import java.util.*;
public class Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println(("Enter First number : "));
        int n1 = sc.nextInt();
        System.out.println(("Enter Second number : "));
        int n2 = sc.nextInt();
        System.out.println(("Enter the operator : "));
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println(n1+n2);
            break;
            case '-' : System.out.println(n1-n2);
            break;
            case '*' : System.out.println(n1*n2);
            break;
            case '/' : System.out.println(n1/n2);
            break;
            case '%' : System.out.println(n1%n2);
            break;
        }
    }
}
