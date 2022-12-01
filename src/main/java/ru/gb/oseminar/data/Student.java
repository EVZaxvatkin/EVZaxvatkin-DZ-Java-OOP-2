package ru.gb.oseminar.data;

public class Student extends User {
    private long studentID;


    public Student(String firstname, String laststname, String patronymic, long studentID) {
        super(firstname,laststname, patronymic);
        this.studentID=studentID;


    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }


}
