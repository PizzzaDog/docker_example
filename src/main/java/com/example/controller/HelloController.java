package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String check() {
        return "I'm alive Spring boot app inside docker image, mfckr!";
    }
}
