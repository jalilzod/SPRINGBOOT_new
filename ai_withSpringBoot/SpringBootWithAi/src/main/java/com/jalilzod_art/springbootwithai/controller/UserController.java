package com.jalilzod_art.springbootwithai.controller;

import com.jalilzod_art.springbootwithai.entites.UserEntity;
import com.jalilzod_art.springbootwithai.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String users(Model model) {

        for(UserEntity user:userRepository.findALl()){
            model.addAttribute("user", user);
        }
        return "users";
    }

    @GetMapping("/register-form")
    public String getAllUsers() {
        return "register-form";
    }


    @PostMapping(value = "/register-form",consumes = "application/x-www-form-urlencoded")
    public String handleUserForm(@RequestParam String name,
                                 @RequestParam String email,
                                 Model model) {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "after-submit";
    }

}
