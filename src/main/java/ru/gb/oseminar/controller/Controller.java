package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstname, String laststname, String patronymic) {
        userService.createUser(firstname, laststname, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnControl(students);
    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId){
        return userService.createUser(firstName, lastName, patronymic, teacherId);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
    public List<StudyGroup> createTimetable(Teacher teacher, List<Student> studentList) {
        return studyGroupService.completeStudyGroup(teacher, studentList);
    }

    public void showStudyGroups(List<StudyGroup> studyGroups){
        studentView.showStudyGroups(studyGroups);
    }
}

