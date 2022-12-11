import java.util.*;
public class this_Super_Keyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();

        System.out.println();

        h1.HorseFunction1();

        System.out.println();

        h1.HorseFunction2();
    }
}

class Animal {
    String colour = "Brown";
    int number = 12;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    String colour = "Green";
    int number = 53;

    
    //Super constructor or Super keyword should be given either inside 'the constructor' or inside a 'method';
    //this constructor or Super keyword should be given either inside 'the constructor' or inside a 'method';
    
    //Non - Parametrized constructor
    Horse() {
        //Nothing;  //Since its a Non - Parametrized constructor of child class, it will call parent class's Non - Parametrized constructor;
                        
    }

    //Method - 1
    void HorseFunction1() {
        System.out.println(this.colour); //Refer to this class colour ;
        System.out.println(this.number); //Refer to this class colour ;
    }

    //Method - 2
    void HorseFunction2() {
        System.out.println(super.colour); //Refer to parent class colour ;
        System.out.println(super.number); //Refer to parent class number ;
        System.out.println("Horse constructor is called");
    }

}


