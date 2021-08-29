package com.iwill.nacos.config.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value(value = "${info:hello world}")
    private String info ;

    @GetMapping("get-info")
    public String getInfo(){
        return info ;
    }
}
