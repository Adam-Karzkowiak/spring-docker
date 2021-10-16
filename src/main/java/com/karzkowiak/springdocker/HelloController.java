package com.karzkowiak.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello container";
    }
}
