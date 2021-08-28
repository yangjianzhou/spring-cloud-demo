package com.iwill.nacos.sample.provider.service;

import com.iwill.nacos.sample.api.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String s) {
        return "Hello World : " + s;
    }

    @Override
    public String greet() {
        return "greet";
    }
}
