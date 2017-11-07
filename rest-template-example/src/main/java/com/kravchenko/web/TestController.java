package com.kravchenko.web;

import com.kravchenko.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    private static final String BLOG_SERVICE_URL = "http://localhost:3001";
    private final RestTemplate restTemplate;


    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(path = "/wat")
    public int sendRequestForBlog() {
        ResponseEntity<ArrayList> forEntity = restTemplate.getForEntity(BLOG_SERVICE_URL + "/blog/all", ArrayList.class, Collections.emptyMap());
        return forEntity.getBody().size();
    }

    @GetMapping(path = "/war")
    public String healthCheck(@RequestParam(defaultValue = "Igor") String author,
                              @RequestParam(defaultValue = "SomeText") String message) {
        return author + " " + message;
    }

    @GetMapping(path = "/blog/all")
    public List<Blog> getBlogs(){
        return new ArrayList<Blog>(){{
            add(Blog.of("one"));
            add(Blog.of("two"));
            add(Blog.of("three"));
        }};
    }


}
