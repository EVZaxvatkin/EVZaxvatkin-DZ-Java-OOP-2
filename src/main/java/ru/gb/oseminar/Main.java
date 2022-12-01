package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Ivan", "Ivanov", "Ivanovich");
        controller.createUser("Anton", "Antonov", "Antonovich");
        controller.createUser("Vladimir", "Vladimirov", "Vladimirovich");

        Teacher teacher = controller.createTeacher("Anna", "Lastochkina", "Petrovna", 001L);
        controller.createTimetable(teacher, controller.getOnlyStudents(),111);
        controller.clearUsers();
        controller.createUser("Petr", "Sidorov", "Ivanovich");
        controller.createUser("Ivan", "Petrov", "Sergeevich");
        controller.createUser("Aleksey", "Ivanov", "Alexsandrovich");

        controller.createTimetable(controller.createTeacher("Anna", "Lastochkina", "Petrovna", 222L)
                , controller.getOnlyStudents(), 123);

        controller.showStudentsInGroups();



    }
}