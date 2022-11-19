package oops.inheritance;

public class Oops {
    public static void main(String[] args) {
        Student Kunal = new Student("Rahul", 14, 15.02f  );
        Student Amit = new Student("Amit" , 13, 15.02f);
        System.out.println(Kunal.name);
        System.out.println(Amit.roll);
        System.out.println(Amit.roll);
    }
}

class Student {
    int roll;
    float marks;
    String name;

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

}