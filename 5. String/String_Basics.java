import java.util.*;

public class String_Basics {

    public static void printCharAt (String fullname) {
        for(int i=0;i<fullname.length();i++) {
            System.out.print(fullname.charAt(i)+ " ");
    }
    //System.out.println();
}
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter First name :");
        String firstname = sc.nextLine();
        System.out.println();
    System.out.println("Enter Second name :");
        String lastname = sc.nextLine();
        System.out.println();

        //String Concatenate
        String fullname = firstname + " " + lastname;
        System.out.println("The Fullname is :");
        System.out.println(fullname);
        //int Length = fullname.length();

        System.out.println();
        //String Length
        System.out.println("The length of String 'fullname' is : " + fullname.length()); //Length is a function for string; Length is the property for array;
        
        System.out.println();

        //chatAt Function call
        printCharAt(fullname);
    }
}
