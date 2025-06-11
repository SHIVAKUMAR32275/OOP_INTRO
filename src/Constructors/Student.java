package Constructors;

import Constructors.EntranceExam;

public class Student {
    int student_id;
    String student_name;
    EntranceExam e1;


    // default constructor , which dont have any parameters
    Student()
    {
        student_id = 0;
        student_name = null;
        e1 = new EntranceExam();
    }

    // parameterized constructor
    Student( int student_id ,String student_name,EntranceExam e1){
        this.student_name = student_name;
        this.student_id = student_id;
        this.e1 = e1;
    }


    // Copy constructor - creates a new object by copying another Student object..........(shallow copy)
    Student( Student otherStudent){
        this.student_id = otherStudent.student_id;
        this.student_name = otherStudent.student_name;
        this.e1 = otherStudent.e1;
    }


//    // copy constructor for deep copy ....
//    Student( Student otherStudent){
//        this.student_id = otherStudent.student_id;
//        this.student_name = otherStudent.student_name;
//        this.e1 = new EntranceExam(otherStudent.e1);
//    }



    // Method to display student details
    void display()
    {
        System.out.println(this.student_id+"  ---------->  "+this.student_name+" ------> "+ e1.examId+" ---->  "+e1.ExamName);
    }
}
