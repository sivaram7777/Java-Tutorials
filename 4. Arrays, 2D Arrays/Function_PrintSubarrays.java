import java.util.*;
public class Function_PrintSubarrays {

    public static void printSubarray (int arr[]) {

            //Nested loop concept
        for(int i=0;i<arr.length;i++) {                                 //Loop 1
            int curr1 = i;      //i = Index
                System.out.println("The elements of arr[i]" + curr1);
            for(int j=i ; j<arr.length; j++) {                          //Loop 2
                int curr2 = j;  //j = Index
                System.out.println("The elements of arr[j]" + curr2);
            for(int k=curr1 ; k<=curr2; k++) {                           //Loop 3
                System.out.print(arr[k]); //arr[k] = Elements of Array (Value)
            }
            System.out.println();
            }
            
        }

    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        /* //Size of array
        System.out.println("Enter array :");
        int arr[] = new int[5];

        //Array inputs
        for(int i =0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        } */
        int arr[] = {1,2,3};
        printSubarray (arr);
    }
}
