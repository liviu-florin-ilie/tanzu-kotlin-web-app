package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Kotlin Boot + Tanzu!";
    }

}