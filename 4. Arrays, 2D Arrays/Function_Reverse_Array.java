import java.util.*;
public class Function_Reverse_Array {

    public static void Reverse(int arr[]) {
        int first = 0; int last = arr.length-1; //'0' based indexing;
         //First and last denotes only "index" of array elements and "not the value" of elements;
        while(first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Reverse(arr);
        for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
        }
    }
}
