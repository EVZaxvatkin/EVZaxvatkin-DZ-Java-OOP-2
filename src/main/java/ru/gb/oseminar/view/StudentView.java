package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.StudyGroupComparator;
import ru.gb.oseminar.data.User;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {


    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (User user : users){
            logger.info(user.toString());
        }
    }
    public void showStudyGroups(List<StudyGroup> studyGroup){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroup) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> students) {
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (Student group : students) {
            logger.info(group.toString());
        }
    }
    public void showStudentsInGroup( List<StudyGroup> studyGroupList){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup groups : studyGroupList) {
//            log.info("Id: " + groups.toString());
            System.out.println("Group №: " + groups.getIDStudentGroup());
            List <Student> studentsList = groups.getStudentList();
            Collections.sort(studentsList, new StudyGroupComparator());
            for (Student student:studentsList){
                System.out.println(student);
//                log.info(student.toString());
            };
        }

    }


}
