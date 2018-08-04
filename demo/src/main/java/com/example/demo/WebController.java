package com.example.demo;


import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
