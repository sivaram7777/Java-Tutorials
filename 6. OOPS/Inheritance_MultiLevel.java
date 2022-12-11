import java.util.*;
public class Inheritance_MultiLevel {
    public static void main(String args[]) {
        dog doberman = new dog(); //Class - Child class-2; 
        doberman.breathe(); //Function - Parent class function;

        /* Animal cat = new Animal();
        cat.legs = 5;
        System.out.println(cat.legs); */
    }
    
}

//Parent class
class Animal {
    void breathe() {
        System.out.println("Breathes");
    }

    String colour;
}

//Child class 1
class mamal extends Animal {
    int legs;

    void eat() {
        System.out.println("eats");
    }
}

//Child class 2
    class dog extends mamal {
        String breeds;

        void bark() {
            System.out.println("Barks");
        }
}
