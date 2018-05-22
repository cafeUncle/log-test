package com.example.logtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}

