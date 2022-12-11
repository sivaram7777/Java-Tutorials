import java.util.*;
public class Function_AverageofThreenumbers {
    public static int average (int a, int b, int c) {
        a+=1;
        b+=1;
        c+=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int average = (a+b+c)/3;
        return average;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a :");
        a = sc.nextInt();

        System.out.println("Enter b :");
        b = sc.nextInt();

        System.out.println("Enter c :");
        c = sc.nextInt();

        System.out.println(a+" "+b+" "+c);
        System.out.println("The average is : "+ average(a,b,c));
    }
}
