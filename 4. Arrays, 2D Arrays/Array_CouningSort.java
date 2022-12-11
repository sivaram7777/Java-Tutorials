import java.util.*;
public class Array_CouningSort {
    public static void CountingSort (int arr[]) {
        
        int count[] = new int[arr.length];   //Creating a new array = count[];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
    }

    //Sorting
    int j=0;
    for(int i=0;i<count.length;i++) {
        while(count[i]>0) {
            arr[j] =i;
            j++;
            count[i]--;
        }
    }
}

    public static void printArr (int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]); 
            }
    }


    public static void main(String args[]) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
        printArr(arr);
    }
}

