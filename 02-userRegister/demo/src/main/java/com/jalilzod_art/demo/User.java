package com.jalilzod_art.demo;

public class User {
    private Long id;
    private String email;
    private String name;
    private String password;


    public User (Long id,String email,String name,String password){
        this.id = id;
        this.email= email;
        this.name = name;
        this.password = password;
    }


    public Long getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }



}
