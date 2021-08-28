package com.iwill.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Value("${config.name}")
    private String name ;

    @RequestMapping("/")
    public String home(){
        return "hello world" + name;
    }
}
