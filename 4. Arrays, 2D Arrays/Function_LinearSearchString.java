import java.util.*;
public class Function_LinearSearchString {
    //Function for Linear Search
    public static int LinSearch(String foodItems[], String key) {
        for(int i =0; i<foodItems.length; i++) {
            if(foodItems[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //Size of array
        String foodItems[] = new String [6];

        //Enter elements of array
        System.out.println("Enter the Elements of array : ");
        for(int i =0; i<foodItems.length; i++) {
            foodItems[i] = sc.nextLine();
        }

        //Enter key
        System.out.println("Enter Key");
        String key = sc.nextLine();

        //Linear search - Output statement
        int index = LinSearch(foodItems,key);
        
        if (index == 1) {
            System.out.println("Key is found");
        } else {
            System.out.println("Key is not found");
        } 

    }
}
