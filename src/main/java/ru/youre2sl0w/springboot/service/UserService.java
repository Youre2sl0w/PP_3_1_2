package ru.youre2sl0w.springboot.service;

import ru.youre2sl0w.springboot.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User updateUser(User user);

    User findUserById(Long id);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}