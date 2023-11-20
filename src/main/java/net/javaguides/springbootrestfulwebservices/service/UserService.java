package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);
}
