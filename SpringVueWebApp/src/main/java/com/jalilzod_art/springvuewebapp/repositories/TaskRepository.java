package com.jalilzod_art.springvuewebapp.repositories;

import com.jalilzod_art.springvuewebapp.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Tasks, Long> {
}
