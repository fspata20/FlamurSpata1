package day8;

import java.time.LocalDate;

public class Student extends Person{
    private boolean hasPreviousJavaKnowledge;


    public Student(String firstname, String lastname, String dateofbirth) {
        super(firstname, lastname, dateofbirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }


    public Student(String firstname, String lastname, String dateofbirth, boolean hasPreviousJavaKnowledge) {
        super(firstname, lastname, dateofbirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }
}
