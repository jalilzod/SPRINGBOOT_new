package com.jalilzod_art.springbootwithai.repositories;

import com.jalilzod_art.springbootwithai.entites.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
    List<UserEntity>  findALl();
    void save(UserEntity user);
    void deleteById(Long id);
    UserEntity findById(Long id);
    void update(UserEntity user,Long id);

}
