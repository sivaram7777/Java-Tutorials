import java.util.*;

public class Array_BubbleSort {

    public static void BubbleSort (int arr[]) {
        int n= arr.length;
        for (int i=0; i<n; i++) { //Number of iterations to be performed
            for (int j=0; j<n-1; j++) { //Compare and Swapping numbers
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
    }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {9,3,2,5,1,7};
        BubbleSort (arr);
        }
    }
