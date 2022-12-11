import java.util.*;
public class MethodScope_Example{

public static void Hello(int s) {

    s = 45;
    System.out.print(s);
}


public static void main (String args[]){
    int s = 54;
    System.out.print(s);
    System.out.println();
    Hello(s);
}
}
