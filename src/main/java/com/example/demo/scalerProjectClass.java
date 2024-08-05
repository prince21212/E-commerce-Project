package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class scalerProjectClass {
     @GetMapping("/hi")
    public String sayHello(){
        return"hi priince";
    }
}
