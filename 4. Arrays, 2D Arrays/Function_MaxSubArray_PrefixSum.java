import java.util.*;
public class Function_MaxSubArray_PrefixSum {

    public static void SumofSubarray (int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length]; //Creating new prefix array

        prefix[0] = 0; //First element of prefix is '0'

        for (int i=1;i<prefix.length;i++) {
            prefix[i] = prefix[i-1] + arr[i]; //Prefix elements
        }

        for(int i =0; i<arr.length; i++) {
            int start = i;
            for (int j=i; j<arr.length; j++) {
                int end = j;

                //Calculating currsum
            currsum = (start==0) ? prefix[end] : prefix[end] - prefix[start-1]; 
                
                System.out.println(currsum);

                //Calculating MaxSum
                if(maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        System.out.println();
        }
    System.out.println("The maximum value is: "+maxsum);
    }

    //Main Function
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        int arr[] = {1,2,3,4,5,6};
        SumofSubarray (arr);

    }
}

