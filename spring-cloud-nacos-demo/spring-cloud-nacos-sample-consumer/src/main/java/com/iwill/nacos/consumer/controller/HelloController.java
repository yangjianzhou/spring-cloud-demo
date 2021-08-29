package com.iwill.nacos.consumer.controller;

import com.iwill.nacos.sample.api.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    private IHelloService helloService ;

    @Value("${info}")
    private String info ;

    @GetMapping("say-hello")
    public String sayHello(){
        return helloService.sayHello("zhangsan");
    }

    @GetMapping("get-info")
    public String getInfo() {
        return info;
    }
}
