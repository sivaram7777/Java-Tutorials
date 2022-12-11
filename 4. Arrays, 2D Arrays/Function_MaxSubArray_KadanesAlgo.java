import java.util.*;
public class Function_MaxSubArray_KadanesAlgo {

    public static void kadanes (int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<arr.length;i++) {
            currsum += arr[i];
            if (currsum <0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        
        System.out.println(currsum);
        System.out.println(maxsum);
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
