import java.util.*;
public class Function_To_Print_Sum_of_Odd_and_Even_Intergers {

    public static int SumOfOddnEven (int sum){

        //Method -1 

/*      int sum1 = 0;
        int sum2 = 0;
        
    
    while (n>0) {
        int lastdigit = n%10;
        if(lastdigit%2 != 0) {       //Odd
        sum1 = sum1 + lastdigit;
        } else {                     //Even
            sum2 = sum2 + lastdigit;
        }
        n = n/10;
    }

    int sum = sum1+sum2;

    System.out.println("The sum of Odd integers are:" + sum1);
    System.out.println("The sum of even integers are:" + sum2);
    System.out.println("The sum of all integers are:" + sum);
    return sum; */

    //Method 2

    Scanner sc = new Scanner(System.in);
    int oddsum = 0;
    int evensum = 0;
    int choice;
    
    do {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
    if(n%2 ==0) {
        evensum += n;
    } else {
        oddsum += n;
    }

    System.out.print("Choice = 1 for Proceed and Choice = 0 for Abort : ");
    choice = sc.nextInt();
    
    } while (choice==1);

    System.out.println("Odd sum is " + oddsum);
    System.out.println("Even sum is " + evensum);
    System.out.println("Total Sum is " + (oddsum+evensum));

    return sum;
}
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        SumOfOddnEven (sum);
    }
}
