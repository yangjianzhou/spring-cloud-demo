package com.iwill.server.controller;

import com.iwill.server.service.ServerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("server")
public class ServerController {

    @Autowired
    private ServerService serverService ;

    @GetMapping("get-name")
    public String getConsumerName(){
        log.info("enter server getConsumerName");
        return serverService.getName();
    }
}
