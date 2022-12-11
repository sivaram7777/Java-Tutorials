import java.util.*;             //For accessing inbuilt function like input;
import java.util.Arrays;        //For Ascending sort;
import java.util.Collections;   //For Descending sort;
public class Arrays_InbuiltSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Integer arr[] = new Integer [5];
        System.out.println("Enter the array elements : ");  //Array Input;
        for (int i=0;i<arr.length;i++) {
            arr[i]  = sc.nextInt();
        } 

        System.out.println();


        Arrays.sort(arr); //Ascending Order;
        System.out.println("The sorted arrays in ascending Order are :");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        } 

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder()); //Descending Order;
        System.out.println("The sorted arrays in descending Order are :");
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        } 
    }
}
