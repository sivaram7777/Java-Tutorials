import java.util.*;
public class PrimeOrNot_Check {
    public static void main (String ars[]){
        Scanner sc = new Scanner (System.in);
        int i, n, flag =0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        
        for (i=1;i<=n; i++){
            if (n%i ==0){
            flag++; //flag = flag + 1;
            System.out.println("It is divisible by : "+ i); //Prime number = Number divisible by 1 and itself;
            System.out.println("Iteration : "+ flag); //Number of iteration = 2;
        }
    }

        //To check the number is a prime or not
        if (flag == 2){
            System.out.println("The number is Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
    }
}
