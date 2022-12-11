import java.util.*;
public class PrivateKeyword_GettersNSetters {
    public static void main(String args[]) {
        //Class 1
        Bearcub c1 = new Bearcub();
        c1.eats();

        //Getters and Setters
        c1.Setname("BearCub");
        System.out.println(c1.getname());

        System.out.println();
        
        //Class 2
        parrot p1 = new parrot();
        p1.colour();
        p1.Setname("Parrot");
        System.out.println(p1.getname());
    }
}


class Bearcub {                 //Parent class
    void eats() {
        System.out.println("Eats Fish and Honey");     
    }

    //Private Keyword; 
    private String name; 

    //Getters and Setters;
    String getname ()  {
        return this.name;
    }

    void Setname (String name) {
        this.name = name;
    }

}

class parrot extends Bearcub {  //Child class

    void colour () {
        System.out.println("Green");
    }
}

