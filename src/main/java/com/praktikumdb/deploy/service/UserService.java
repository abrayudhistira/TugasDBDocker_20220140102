package com.praktikumdb.deploy.service;

import com.praktikumdb.deploy.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
