package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public void createNewStudyGroup(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void createUser(String firstname, String laststname, String patronymic) {
        userService.createUser(firstname, laststname, patronymic);
    }

    public Teacher createTeacher(String firstName, String lastName, String patronymic, Long teacherId){
        return userService.createUser(firstName, lastName, patronymic, teacherId);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public StudyGroupService createStudyGroups() {
        return new StudyGroupService();
    }

    public void showStudyGroups() {
        studentView.showStudyGroups(this.studyGroupService.getStudyGroupList());
    }

    public void showSortStudyGroup(List<Student> studentList){
        Collections.sort(studentList, new StudyGroupComparator());
        studentView.showStudents(studentList);
    }

    public void createTimetable(Teacher teacher, List<Student> studentList, Integer groupId) {
        this.studyGroupService.completeStudyGroup(teacher, studentList, groupId);
    }

    public void clearUsers(){
        this.userService.clearAll();
    };

    public void showStudentsInGroups() {
        this.studentView.showStudyGroups(this.studyGroupService.getStudyGroupList());

    }


}

