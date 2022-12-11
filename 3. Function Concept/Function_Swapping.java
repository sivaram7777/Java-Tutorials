import java.util.*;
public class Function_Swapping {

    public static void swap (int a, int b){
        int temp = a;
        a= b;
        b= temp;
        //Java always use Call by Value function
        System.out.println("Swapped a is : " + a);
        System.out.println("Swapped b is : " + b);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("a is : " + a); //This statement will return the original non - swapped value of 'a'
        System.out.println("b is : " + b); //This statement will return the original non - swapped value of 'b'
    }
}