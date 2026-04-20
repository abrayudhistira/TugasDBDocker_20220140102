package com.praktikumdb.deploy.service;

import java.util.UUID;

import com.praktikumdb.deploy.model.User;
import com.praktikumdb.deploy.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUSer(User request) {
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }

}
