package com.nestdigital.studentapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @GetMapping("/")

    public String Homepage(){
        return "welcome to my website";

    }
    @GetMapping("/contact")
    public String Contactpage() {
        return "welcome to my contact";
    }

    }
