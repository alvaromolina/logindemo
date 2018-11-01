package com.ucbcba.logindemo.services;

import com.ucbcba.logindemo.entities.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}