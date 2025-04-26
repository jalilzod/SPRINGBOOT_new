package com.jalilzod_art.demo;

public interface UserRepository {

    void save(User user);
    User findByEmail(String email);

}
