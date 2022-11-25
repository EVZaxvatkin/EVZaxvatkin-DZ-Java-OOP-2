package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public Teacher createUser(String firstName, String lastName, String patronymic, Long Id) {
        return new Teacher(firstName, lastName, patronymic, Id);
    }


    @Override
    public void createUser(String firstname, String laststname, String patronymic) {
        long id=0;
        for (User item : this.users){
            if (item instanceof Student){
                if (id < ((Student) item).getStudentID()){
                    id = ((Student) item).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstname, laststname, patronymic, id++));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item : this.users){
            if (item instanceof Student){
                if (id.equals(((Student) item).getStudentID())){
                    users.remove(item);
                }
            }
        }

    }
    public List<Student> getAllStudents(){
        List <Student> listStudents = new ArrayList<>();
        for (User user:this.getAll()
        ) {
            if(user instanceof Student){
                listStudents.add((Student) user);

            }

        }

        return listStudents;
    }
}
