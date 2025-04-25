package com.jalilzod_art.demo;

public interface UserRepository {

    void saveUser(User user);
    User findByEmail(String email);
}
