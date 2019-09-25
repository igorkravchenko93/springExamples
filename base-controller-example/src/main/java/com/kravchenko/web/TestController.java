package com.kravchenko.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/health")
    public String healthCheck(@RequestParam(defaultValue = "Igor") String author,
                              @RequestParam(defaultValue = "SomeText") String message) {
        return author + " " + message;
    }
}
