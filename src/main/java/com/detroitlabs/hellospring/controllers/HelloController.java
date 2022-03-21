package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String sayHello() {
        return "home";
    }

    @RequestMapping("/happyDog")
    @ResponseBody
    public String happyDog() {
        return "Woof, Woof";
    }

}


