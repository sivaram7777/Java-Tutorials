/* import java.util.*;
public class Function_PrintPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The Prime numbers in the given range are :");

        int i,j, flag = 0;

        for(i=1;i<=n;i++) {     //Outer loop flag will not work for Inner loop; 
            flag = 0;           //We have to initialize it once again;
            for(j=1;j<=i;j++){
                if (i%j == 0) {
                    flag = flag +1;
                }
            }
            if(flag==2) {
                System.out.println(i);
            }
        }
    }
}
 */


import java.util.*;
public class Function_PrintPrime {

    //To Check whether the number is prime or not
    public static boolean isPrime(int n) {
        if (n==2){  //2 is Even prime number;
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    //To print prime numbers in range
        public static void PrimesinRange (int n) {
            for(int i = 1; i<n;i++) { 
                if (isPrime(i)) {       //Calling a Function inside a Function;
                System.out.println(i);
                }
            }
        }

        
        //Main Function
        public static void main(String args[]) {
            PrimesinRange(20);

        }
    }

