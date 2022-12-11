import java.util.*;
public class OOPS_Basics {

    public static void main(String[] args) {
        Student s1 = new Student("Sivaram", 24, 88, 8.6);
        //String name = "Ramesh Kumar";     //Local variable;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        System.out.println(s1.cgpa);
        //System.out.println(name);

        System.out.println();

        Student s2 = new Student("Suresh", 23, 77, 8.9);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.marks);
        System.out.println(s2.cgpa);
        s2.password = "abcd";
        System.out.println(s2.password);

    }
}

//Class acts as a Blueprint for Objects
    class Student {
        String name;
        String password;
        int age;
        int marks;
        float cgpa;

        Student (String name, int age, int marks, double cgpa) {
            this.name = name; //this keyword - represents the instance variable of current object;
            this.age = age;
            this.marks = marks;
            this.cgpa = (float) cgpa;
        }
    }
