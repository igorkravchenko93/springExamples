package com.kravchenko.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class TestController {

    private static final String BLOG_SERVICE_URL = "http://localhost:3000";
    private final RestTemplate restTemplate;


    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(path = "/wat", method = RequestMethod.GET)
    public int sendRequestForBlog() {
        ResponseEntity<ArrayList> forEntity = restTemplate.getForEntity(BLOG_SERVICE_URL + "/blog/all", ArrayList.class, Collections.emptyMap());
        return forEntity.getBody().size();
    }

    @RequestMapping(path = "/war", method = RequestMethod.GET)
    public String healthCheck(@RequestParam(defaultValue = "Igor") String author,
                              @RequestParam(defaultValue = "SomeText") String message) {
        return author + " " + message;
    }

}
