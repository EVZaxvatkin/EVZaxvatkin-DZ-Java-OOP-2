package ru.gb.oseminar.service;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface DataService {

    void createUser(String firstname, String laststname, String patronymic);
    List<User> getAll();

    void deleteUser(Long id);
}
