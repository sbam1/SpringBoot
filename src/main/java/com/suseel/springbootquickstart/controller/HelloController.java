package com.suseel.springbootquickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHI() {
        return "Hi!!!!!!!";
    }


    @RequestMapping("/")
    public String welcome() {
        return "wellcome to spring boot spring web application";
    }
}
