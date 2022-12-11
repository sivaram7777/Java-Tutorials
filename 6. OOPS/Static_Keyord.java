import java.util.*;
public class Static_Keyord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "JMV";
        System.out.println(s1.SchoolName);

        System.out.println();

        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        System.out.println();

        Student s3 = new Student();
        s3.SchoolName = "TVS";
        System.out.println(s3.SchoolName);

    }
}
class Student {
    String name;
    int roll;

    static String SchoolName;

    void setname (String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}