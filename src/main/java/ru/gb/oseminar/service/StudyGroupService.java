package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public List<StudyGroup> completeStudyGroup(Teacher teacher, List<Student> studentList){

        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(new StudyGroup(teacher, studentList));
        return studyGroupList;
    }
}
