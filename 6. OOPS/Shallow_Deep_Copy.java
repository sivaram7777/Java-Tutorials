import java.util.*;
public class Shallow_Deep_Copy {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 45;
        s1.marks[1] = 85;
        s1.marks[2] = 95;

            for(int i=0; i<3;i++) {
                System.out.println(s1.marks[i]);
            }        
            

        System.out.println();

        Student s2 = new Student(s1);   //Passing Object 's1' as the parameter
        s1.marks[2] = 30;
        for(int i=0; i<3;i++) {
            System.out.println(s2.marks[i]);
        } 


    }
}

//Class acts as a Blueprint for Objects
    class Student {
        int marks[];

        Student () {
            marks = new int [3];
        }

        //Shallow Copy constructor
        Student (Student s1) {

            //Shallow Copy constructor
            /* this.marks = s1.marks; */ 

            //Deep Copy constructor
            for(int i=0; i<marks.length;i++) {
                this.marks[i] = s1.marks[i];
            }
        }


    }
