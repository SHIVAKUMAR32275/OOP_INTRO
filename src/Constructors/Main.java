package Constructors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntranceExam e1 = new EntranceExam(101,"maths");
        EntranceExam e2 = new EntranceExam(109,"biology");

        // creating object and setting/passing the parameters manually
        Student s = new Student();
        s.student_id = 10;
        s.e1 = new EntranceExam(1001,"english");
        s.student_name="shiva";
        s.display();

        // creating object and passing parameters using constructor
        Student s1 = new Student(34,"venu",e1);
        s1.display();


        // Creating another Student object using default constructor without setting values
        Student s2 = new Student();
        s2.display();

        Student s3 = new Student(12,"ramesh",e2);
        s3.display();

        // creating as student object for implementation of copy constructor
        Student s4 = new Student(s3);
        s4.display();


        // here s4 and s5 will share the same address........
        Student s5 = s;
        s5.display();
    }
}