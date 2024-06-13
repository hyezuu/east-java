package day0613;

public class Student extends Person{
    private int studentNum;

    public Student(String name, String ssn, int studentNum) {
        super(name, ssn);
        this.studentNum = studentNum;
    }
}
