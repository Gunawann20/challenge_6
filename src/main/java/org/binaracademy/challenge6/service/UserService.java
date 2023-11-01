package org.binaracademy.challenge6.service;

import org.binaracademy.challenge6.entity.User;
import org.binaracademy.challenge6.entity.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
