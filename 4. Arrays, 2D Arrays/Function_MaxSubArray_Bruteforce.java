import java.util.*;
public class Function_MaxSubArray_Bruteforce {

    public static void SumofSubarray (int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++) {
            int start = i;
            for (int j=i; j<arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k= start; k<=end; k++) {
                    //System.out.print(arr[k]);
                    currsum += arr[k];
                } 
                
                System.out.println(currsum);

                if(maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        System.out.println();
        }
    System.out.println("The maximum value is: "+maxsum);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        int arr[] = {1,2,3,4,5,6};
        SumofSubarray (arr);

    }
}
