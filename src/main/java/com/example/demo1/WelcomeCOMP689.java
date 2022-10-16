package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeCOMP689 {
    @GetMapping("/welcomeCOMP689")
    public String welcomeMessage(){
        return "Welcome to the Advance Distributed System's course(COMP689)!" +
                " This is a Springboot RESTAPI application that is designed by Narius Davar.";

    }
}
