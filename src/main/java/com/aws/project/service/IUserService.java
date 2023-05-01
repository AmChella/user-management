package com.aws.project.service;

import com.aws.project.entity.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}