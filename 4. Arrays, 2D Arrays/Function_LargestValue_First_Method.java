import java.util.*;
public class Function_LargestValue_First_Method {
    public static int Largestvalue (int numbers[]) {
        int Largest = Integer.MIN_VALUE;  //-Infinity = Minvalue
        int smallest = Integer.MAX_VALUE; //+Infinity = Maxvalue

        for(int i=0;i<numbers.length; i++){
        if (Largest < numbers[i]) { //numbers[i] should be greater than largest
            Largest = numbers[i];
            //System.out.println(Largest);
        }

        if (smallest > numbers[i]) { //numbers[i] should be lesser than smallest
            smallest = numbers[i];
            System.out.println(smallest);
        }
    }
    System.out.println("The smallest Value is : " + smallest);
    return Largest;
    
}


    public static void main (String args[]) {
        int numbers[] = {20,50,40,87,46,78,99,45,56,22,64};
        System.out.println("The largest number is : "+ Largestvalue(numbers));
        
    }
}
