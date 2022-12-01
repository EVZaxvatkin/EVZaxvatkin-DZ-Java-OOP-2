package ru.gb.oseminar.data;

import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentList;

    public Integer getIDStudentGroup(){
        return idStudentGroup;
        }
    private Integer idStudentGroup;

    public StudyGroup(Teacher teacher, List<Student> studentList, Integer idStudentGroup){
        this.teacher=teacher;
        this.studentList=studentList;
        this.idStudentGroup=idStudentGroup;

    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }




    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                "studentList=" + studentList +
                "idStidentGroup=" + idStudentGroup +
                '}';
    }
}
