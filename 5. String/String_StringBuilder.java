import java.util.*;
public class String_StringBuilder {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder ("Hello ");
        for(char ch = 'a'; ch <='z'; ch++) {
            sb.append(ch + " ");
    }
    System.out.println(sb);
}
}
