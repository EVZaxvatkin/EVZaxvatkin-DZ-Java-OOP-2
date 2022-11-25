package ru.gb.oseminar.data;

import java.util.List;

public class StudyGroup {

    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher=teacher;
        this.studentList=studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
