import java.util.*;
public class Function_Decimaltobinary {

public static void ConvertDecNum_to_BinNum (int n){
    int i = 0;
    int sum = 0;

    while(n>0) {
    int rem = n%2;
    sum = sum + (rem * (int) Math.pow(10, i)); //Typecasting
    n = n/2;
    i++;
    }
    System.out.println("The Binary number is : "+ sum);
}

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int n = sc.nextInt();
        ConvertDecNum_to_BinNum(n);
        
    }
}



