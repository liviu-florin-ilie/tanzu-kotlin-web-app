package com.tietoevry.survey;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class ApiController {

    @RequestMapping("/")
    fun index(): String {
        return "Greetings from Spring Kotlin Boot + Tanzu!";
    }

}