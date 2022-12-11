import java.util.*;
public class String_Shortest_Path {

    public static float get_shortest_path (String path) {
        int x=0 , y=0;

        for(int i=0;i<path.length();i++) {
        char direction = path.charAt(i);

        if(direction == 'N') {                  //North
            y++;
        }

        else if (direction == 'S') {            //South
            y--;
        }

        else if (direction == 'W') {            //West
            x--;
        }

        else {                                  //East
            x++;
        }
    }

    int X2 = x*x;
    int Y2 = y*y;

    return (float) Math.sqrt(X2 + Y2);          //Formula
} 
    
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the path : ");
        String path = sc.nextLine();
        System.out.println(get_shortest_path(path));

    }
}
