import java.util.*;
public class PatternPrinting_Star {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        for(int line=1; line<=4; line++) {  //Inner loop
            for(int star=1; star<=line; star++) { //Outer loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
