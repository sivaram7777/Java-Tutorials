import java.util.*;                             ////Default code for accessing all built-in utility functions.

public class Array_Input_and_Output {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);    //Default code for accessing built-in "input" function.
            int arr[] = new int[5];             //Declaring the size of an array
        int i=0;
        System.out.println("Enter the elements of array:");
            for( i=0;i<arr.length;i++) {
                arr[i] = sc.nextInt();          //Array input
            }
            System.out.println();
            for( i=0;i<arr.length;i++) {
                System.out.println(arr[i]);     //Array output
            }
            
    }
}
