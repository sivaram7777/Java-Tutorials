public class OOPS_Basics3 {
    public static void main(String[] args) {
        //
        Deer d1 = new Deer();
        d1.eats();

        Deer d2 = new Deer("Sambar_Deer", 5);
        System.out.println(d2.numbers);
        System.out.println(d2.type);

    }
}

class Deer {
    String type;
    int numbers;

    //Definition for Non - parameterized constructor
    Deer() {
        //Nothing;
    }

    //Definition for parameterized constructor
    Deer(String type, int numbers) {
        this.type = type;
        this.numbers = numbers;
    }

    void eats() {
        System.out.println("Eats Grass");
    }


}