package com.karzkowiak.springdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${env.name}")
    private String envName;

    @GetMapping("/hello")
    public String hello() {
        return "hello container " + envName;
    }
}
