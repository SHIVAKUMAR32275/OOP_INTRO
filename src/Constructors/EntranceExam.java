package Constructors;

public class EntranceExam {
    int examId;
    String ExamName;


    // default constructor
    EntranceExam(){
        examId = 0;
        ExamName =" unKnown";
    }


    // parameterized constructor
    EntranceExam(int examId,String examName){
        this.examId = examId;
        this.ExamName = examName;
    }


    //copy constructor for deep copy
    EntranceExam( EntranceExam exam){
        this.examId = exam.examId;
        this.ExamName = exam.ExamName;
    }

}
