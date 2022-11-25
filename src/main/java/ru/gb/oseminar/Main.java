package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudyGroup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name", "Lastname", "Patronymic");
        controller.createUser("Ivan", "Ivanov", "Ivanovich");
        controller.createUser("Anton", "Antonov", "Antonovich");
        controller.createUser("Vladimir", "Vladimirov", "Vladimirovich");
        controller.showAllStudents();

        List<StudyGroup> studyGroups  = controller.createTimetable(controller.createTeacher("Anna", "Sidorova", "Petrovna", 101L),
                controller.getOnlyStudents());
        controller.showStudyGroups(studyGroups);
     }
}