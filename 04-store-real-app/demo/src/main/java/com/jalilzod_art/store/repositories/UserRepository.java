package com.jalilzod_art.store.repositories;

import com.jalilzod_art.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
