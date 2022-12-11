import java.util.*;
public class Function_LargestValue_Second_method {

    public static int Largestvalue (int numbers[]) {

        int largest, smallest;
        largest = numbers[0];
        smallest = numbers[0];

        for(int i=0;i<numbers.length; i++){
        if(numbers[i] > largest) { //Here, numbers[i] should be greater
            largest = numbers[i];
            System.out.println(largest);
        } 

        if(numbers[i] < smallest) { //Here, numbers[i] should be smaller
            smallest = numbers[i];
            System.out.println(smallest);        
        }
        }
    System.out.println("The smallest Value is : " + smallest);
    return largest;
    
}


    public static void main (String args[]) {
        int numbers[] = {20,50,40,87,46,78,99,45,56,22,64};
        System.out.println("The largest number is : "+ Largestvalue(numbers));
        
    }
}

