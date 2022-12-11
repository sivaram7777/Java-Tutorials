import java.util.*;
public class Function_LinearSearch {

    //Function for Linear Search
    public static int LinSearch(int numbers[], int key) {
        for(int i =0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return 1;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //Size of array
        int numbers[] = new int [6];

        //Enter elements of array
        System.out.println("Enter the Elements of array : ");
        for(int i =0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        //Enter key
        System.out.println("Enter Key");
        int key = sc.nextInt();

        //Linear search - Output statement
        int index = LinSearch(numbers,key);
        
        if (index == 1) {
            System.out.println("Key is found");
        } else {
            System.out.println("Key is not found");
        } 

    }
}
