import java.util.*;
public class Inheritance_Hybrid {
    public static void main(String args[]) {
        doberman d1 = new doberman(); //Class - Child class 3; 
        d1.breathe(); //Function - Parent class function;
        d1.color = "Brown with Black"; //Function - Parent class function;
        System.out.println(d1.color);
        d1.breeds = "Guarding breeds"; //Function - Child class 2 function;
        System.out.println(d1.breeds);

        GermanSheperd g1 = new GermanSheperd(); //Class - Child class 4;
        g1.bark(); ////Function - Child class 2 function;          
    }
    
}

//Parent class
class Animal {
    void breathe() {
        System.out.println("Breathes");
    }

    String color;
}

//Child class 1 from Parent Class
class mamal extends Animal {
    int legs;

    void eat() {
        System.out.println("eats");
    }
}

//Child class 2 from parent Class
    class dog extends Animal {
        String breeds;

        void bark() {
            System.out.println("Barks");
        }
}

//Child class 3 from Child class 2
class doberman extends dog {
    int jumping_height;

    void guarding() {
        System.out.println("Guards the house");
    }

    /* doberman() {
        System.out.println("This is a Doberman Dog");
    } */
}

//Child class 4 from Child Class 2
class GermanSheperd extends dog {
    String behavior;

    void bite() {
        System.out.println("Bites");
    }
}