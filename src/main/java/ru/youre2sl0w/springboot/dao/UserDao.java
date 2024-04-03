package ru.youre2sl0w.springboot.dao;

import ru.youre2sl0w.springboot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User updateUser(User user);

    User findUserById(Long id);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}