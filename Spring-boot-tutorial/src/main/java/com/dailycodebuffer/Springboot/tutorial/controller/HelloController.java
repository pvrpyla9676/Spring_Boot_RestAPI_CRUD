package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    // @RequestMapping(value= "/pvr", method = RequestMethod.GET)
    public String helloWorld() {
        return "Welcome to Daily Code Buffer!! ABC";
    }
}


