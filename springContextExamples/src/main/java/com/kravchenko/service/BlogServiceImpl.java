package com.kravchenko.service;

public class BlogServiceImpl implements BlogService {


    public String getUserName() {
        System.out.println("User");
        return "Igor";
    }
}
