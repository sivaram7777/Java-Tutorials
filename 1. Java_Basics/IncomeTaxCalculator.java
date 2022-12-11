import java.util.*; //1
public class IncomeTaxCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); //2
        System.out.println("Enter the income : ");
        int n = sc.nextInt(); //3
        
        if (n<500000) {
            System.out.println("0% Tax");
        } else if (n>=500000 && n<=1000000) {
            System.out.println("Your tax is : " + (int) ((0.1*n)) + " (10% tax)"); //Type casting
            System.out.println("Total amount = " + (int) ((0.1*n)+(n))); //Type casting
        } else {
            System.out.println("Your tax is : "  + (int) ((0.3*n)) + " (30% tax)"); //Type casting
            System.out.println("Total amount = " + (int) ((0.3*n)+(n))); //Type casting
        }
    }
    
}
