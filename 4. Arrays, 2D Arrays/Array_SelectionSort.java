import java.util.*;

public class Array_SelectionSort {
    public static void SelectionSort (int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int MinPos  = i;
            for(int j=i+1; j<arr.length;j++) {
                if(arr[j] < arr[MinPos]) {
                    MinPos =j;
                }
            }
            //Swapping
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
        //Printing Array elements
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {3,6,7,5,2,1,4,8};
        SelectionSort(arr);
    }
}
