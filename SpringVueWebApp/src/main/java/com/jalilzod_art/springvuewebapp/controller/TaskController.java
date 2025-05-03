package com.jalilzod_art.springvuewebapp.controller;

import com.jalilzod_art.springvuewebapp.entities.Tasks;
import com.jalilzod_art.springvuewebapp.repositories.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    private TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @GetMapping("/tasks")
    public List<Tasks> getTasks() {
        return taskRepository.findAll();
    }

    @PostMapping("/tasks")
    public Tasks createTask(@RequestBody Tasks task) {
        return taskRepository.save(task);
    }

}
