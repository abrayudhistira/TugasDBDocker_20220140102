package com.praktikumdb.deploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praktikumdb.deploy.model.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
