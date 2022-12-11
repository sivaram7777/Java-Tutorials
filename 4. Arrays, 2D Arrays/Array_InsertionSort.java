import java.util.*;

public class Array_InsertionSort {
    public static void InsertionSort (int arr[]) {
        int n = arr.length; int i,j;
        for(i=1;i<n;i++) {
            int temp = arr[i]; //1st element is copied to temp variable;
            for(j=i; j>0 && temp < arr[j-1]; j--) { //'1st' element (temp) and '0th' element is compared;
                arr[j] = arr[j-1]; //if '1st' element ('temp') is less than '0th' element (arr[j-1]), then '1st' is copied to 0th element;
        }
        arr[j] = temp; //(j--,('j' is decremented); the 'temp' variable is copied to '0th' element)
    }
        //Printing Array elements
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    
}


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {3,6,7,5,2,1,4,8};
        InsertionSort(arr);
    }
}
