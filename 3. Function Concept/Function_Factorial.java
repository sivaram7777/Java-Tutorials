/* import java.util.*;
public class Function_Factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();
            int result =factorial(n);                            //In main function, a new variable 'result' is created;
            System.out.println("The Factorial is : " + result); //Output Printing Statement 1;
            
        }
    }
 */


/*  import java.util.*;
    public class Function_Factorial {
        public static int factorial(int n){
            int fact = 1;
            for(int i =1; i<=n; i++){
                fact = fact * i;
            }                                                  //In sub function, printing statement is created before return type;
            System.out.println("The Factorial is : " + fact); //Output Printing Statement 2;
            return fact;
        }
    
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter n:");
                int n = sc.nextInt();
                factorial(n);
        }
    } */

    import java.util.*;
    public class Function_Factorial {
        public static int factorial(int n){
            int fact = 1;
            for(int i =1; i<=n; i++){
                fact = fact * i;
            }
            return fact;
        }
    
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
                System.out.println("Enter n:");
                int n = sc.nextInt();                                      //In main function, the function itself is called inside printing statement;
                System.out.println("The Factorial is : " + factorial(n)); //Output Printing Statement 3;
        }
    }
    
    