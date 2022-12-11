import java.util.*;;
public class AverageOf3Numbers {
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a:");
    int a = sc.nextInt();
    System.out.println("Enter b:");
    int b = sc.nextInt();
    System.out.println("Enter c:");
    int c = sc.nextInt();

    System.out.println("The average is :");
    int avg = (a+b+c)/3;
    System.out.println(avg);
}
}
