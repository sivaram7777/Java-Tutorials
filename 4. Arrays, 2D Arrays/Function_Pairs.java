import java.util.*;
public class Function_Pairs {

    public static void pairs(int arr[]) {
        for(int i=0;i<arr.length; i++) { //Nested Loop
            int curr = arr[i];
            for (int j=i+1;j<=arr.length-1; j++) {
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
        System.out.println();
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        //Size of an Array
        System.out.println("Enter the elements of an array");
        int arr[] = new int [4];
        
        //Array input
        for(int i=0; i<=arr.length-1; i++) {
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }
}
