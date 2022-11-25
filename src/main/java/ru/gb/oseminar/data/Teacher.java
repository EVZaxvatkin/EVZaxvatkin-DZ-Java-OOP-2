package ru.gb.oseminar.data;

public class Teacher extends User {

    private long teacherID;

    public Teacher(String firstname, String laststname, String patronymic, long teacherID) {
        super(firstname, laststname, patronymic);
        this.teacherID=teacherID;

    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }
}
