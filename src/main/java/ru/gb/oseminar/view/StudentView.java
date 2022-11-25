package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnControl(List<User>users){
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (User user : users){
            logger.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void sendOnConsole(List<User>users){
        Logger logger = Logger.getLogger(StudentView.class.getName());
        for (User user : users){
            logger.info(user.toString());
        }
    }
}
