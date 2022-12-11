import java.util.*;
public class Function_Binarytodecimal {
public static void ConvertBinNum_to_DecNum (int n) {
    int i = 0;
    int sum = 0;

    while(n>0) {
    int rem = n%10;
    sum = sum + ((rem) * (int) Math.pow(2, i)); //Typecasting
    n= n/10;
    i++;
    }
    System.out.println("The Decimal number is : "+sum);
}

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        int n = sc.nextInt();
        ConvertBinNum_to_DecNum (n);
        
    }
}
