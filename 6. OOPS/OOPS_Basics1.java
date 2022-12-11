import java.util.*;
public class OOPS_Basics1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sivaram";
        s1.roll = 456;
        s1.password = "Hello1230";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.password);

        System.out.println();

        Student s2 = new Student(s1);   //Passing Object 's1' as the parameter;
        System.out.println(s2.name);
        System.out.println(s2.roll);

        s2.password = "abcd";   //Since, password is changed for 's2. ;
        System.out.println(s2.password); //The changed password is displayed in  output;


        System.out.println();

        Student s3 = new Student(s2);   //Passing Object 's2' as the parameter;
        System.out.println(s3.name);
        System.out.println(s3.roll);

        s3.password = "sdfg";   //Since, password is changed for 's3. ;
        System.out.println(s3.password); //The changed password is displayed in  output;

    }
}

//Class acts as a Blueprint for Objects
    class Student {
        //Properties
        String name;
        int roll;
        int marks;
        float cgpa;
        String password;

        //Functions
        
        //Non-Parametrized Constructor
        Student() {
            //Empty constructor;
        }

        //Copy Constructor
        Student (Student s1) {  //Passing Object 's1' as the parameter;
            this.name = s1.name; 
            this.roll = s1.roll;
            this.password = s1.password;
        }
    }
