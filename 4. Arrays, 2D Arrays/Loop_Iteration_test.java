import java.util.*;

public class Loop_Iteration_test {
    public static void main(String args[]) {
        int i = 0;
    System.out.println(i);
    System.out.println(i+1);
    System.out.println(i+2);
    for(i=0;i<4;i++ ) {
        System.out.println("i = "+i);
        i +=2;
        System.out.println("i = "+i);
    }
    System.out.println(i);
    System.out.println(i+1);
    System.out.println(i+2);
}
}