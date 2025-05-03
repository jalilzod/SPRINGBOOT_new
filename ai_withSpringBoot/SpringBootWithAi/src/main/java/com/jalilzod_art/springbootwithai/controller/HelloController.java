package com.jalilzod_art.springbootwithai.controller;

import com.jalilzod_art.springbootwithai.GreetingsResponse;
import com.jalilzod_art.springbootwithai.UserProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/profile")
    public UserProfile getUserProfile(){
        return new UserProfile("ming",10002.23,26);
    }

    @GetMapping("/greet")
    public GreetingsResponse greetings(@RequestParam String name) {
        return new GreetingsResponse("Hello mr "+name+"!");
    }

    @GetMapping("/greet/{name}")
    public GreetingsResponse greet(@PathVariable String name) {
        return new GreetingsResponse("Hello mr this is from path  "+name+"!");
    }

}
