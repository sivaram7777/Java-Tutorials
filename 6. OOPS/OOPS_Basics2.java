public class OOPS_Basics2 {
        public static void main(String args[]) {  
        //Object Creation  

        //Non Parametrized  Constructor
        Student s1 = new Student();  
        s1.name = "Sivaram";
        s1.id = 5689;

        //Parametrized Constructor
        Student s2 = new Student(10, "David");  
        System.out.println("Student Id : "+s2.id + "\nStudent Name : "+s2.name);  
        s2.roll();
        }  
    }  

class Student {  
        //instance variables of the class  
        int id;  
        String name;  

        //Definition for Function
        void roll() {
            System.out.println("The Roll Number is in the ID Card");
        }

        //Definition for Non - parameterized constructor
        Student() {
            //Empty
        }  

        //Definition for parameterized constructor
        Student(int id, String name){  
        this.id = id;  
        this.name = name;  
        }
    }

class StudentS1 extends Student {
    void lunch() {
        System.out.println("Eats Curd rice for lunch");
    }
}

