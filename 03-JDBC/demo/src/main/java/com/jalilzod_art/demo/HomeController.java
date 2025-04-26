package com.jalilzod_art.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/")
    public String index(){
        System.out.println(appName);
        return "index.html";
    }

    @RequestMapping("/main")
    public String main(){
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName() {
        return "main.html";
    }

}
