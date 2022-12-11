import java.util.*;
public class MultiDimensional_Array_Searching {

    //Search 'key' in array
    public static boolean search (int arr[][], int key) {

        for(int i=0;i<arr.length;i++) {    
        for(int j=0;j<arr[0].length;j++) {
                if (arr[i][j] == key) {
                    System.out.println("The element is found in" + "(" + i + "," + j +")");
                    return true;
            }
        }
    }
    return false;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][4];
        int n = arr.length; int m = arr[0].length;

        //Array input
        System.out.println("Enter the elements of Matrix :");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        //Output array
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    //Function Call
    search(arr, 5);
}
}

