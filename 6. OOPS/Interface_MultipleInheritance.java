import java.util.*;
public class Interface_MultipleInheritance {
    public static void main(String args[]) {
        Bear b1 = new Bear();
        b1.eat_animals();
        b1.eat_plants();

        System.out.println();

        Bearcub c1 = new Bearcub();
        c1.eat_animals();
        c1.eat_plants();
        c1.eats();

        //Getters and Setters
        c1.Setname("BearCub");
        System.out.println(c1.getname());

        System.out.println();

        parrot p1 = new parrot();
        p1.eat_animals();
        p1.eats();
    }
}

//Interface - Blueprint for Class
interface Carnivore {               //Parent 1
    void eat_animals ();
}

interface Herbivore extends Carnivore {               //Parent 2
    void eat_plants ();
}

//Class - Blueprint for Objects
class Bear implements Carnivore , Herbivore {   //Child 1 - inherits from both Parent 1,2;
    public void eat_animals () {
        System.out.println("Eats Animal");
    }

    public void eat_plants () {
        System.out.println("Eats Plants");
    }
}

class Bearcub extends Bear {                    //Child 2 - inherits from Child 1;

    private String name; //Private Keyword; 

    void eats () {
        System.out.println("It eats Honey");
    }

    //Getters and Setters;
    String getname ()  {
        return this.name;
    }

    void Setname (String name) {
        this.name = name;
    }

}

class parrot extends Bearcub {                     //Child 3 - inherits from Child 1;
    void eats() {
        System.out.println("Eats nuts");       //Method Overriding;
    }
}