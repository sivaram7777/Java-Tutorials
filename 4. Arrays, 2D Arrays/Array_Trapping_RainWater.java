import java.util.*;
import java.util.function.IntUnaryOperator;
public class Array_Trapping_RainWater {

    //Auxillary Arrays
    public static int Trapped (int arr[]) {
        //Left_Max Boundary 
        int n = arr.length;
        int LeftMax [] = new int[n]; //Creating a new array LeftMax[] with existing arr[] element and array size
        LeftMax[0] = arr[0]; //'0'th element of arr[] (i.e,) 4 is copied to '0'th element of LeftMax[] (i.e,) 4
        for(int i=1;i<n;i++) {
            LeftMax[i] = Math.max(arr[i], LeftMax[i-1]);
        }

        //Right_Max Boundary
        int RightMax [] = new int[n]; //Creating a new array RightMax[] with existing arr[] element and array size
        RightMax[n-1] = arr[n-1]; //'last' element of arr[] (i.e,) 5 is copied to 'last' element of LeftMax[] (i.e,) 5
        for(int i=n-2;i>=0;i--) {
            RightMax[i] = Math.max(arr[i], RightMax[i+1]);
        }

            //Trapped Water
            int TotalTrappedwater = 0;
            //For Loop
            for(int i=0; i<n; i++) {
                //Water level = Minimum (LeftBoundary , Right Boundary) - 1st Logic
                int waterlevel = Math.min(LeftMax[i], RightMax[i]);

                //Trapped water = (waterlevel - arr[i])
                int trappedwater = (waterlevel - arr[i]);
                System.out.println(trappedwater);
                
                //Total trappedwater  = Sum of all trappedwater
                TotalTrappedwater = TotalTrappedwater + trappedwater;
            }
            System.out.println("The Total trapped water is : "+TotalTrappedwater);
            return TotalTrappedwater;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {4,2,0,6,3,2,5}; //Height of Building (As per given question)
        Trapped (arr);

    }
}
