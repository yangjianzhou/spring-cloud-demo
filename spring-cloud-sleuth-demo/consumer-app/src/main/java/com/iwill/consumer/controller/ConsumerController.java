package com.iwill.consumer.controller;

import com.iwill.consumer.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService ;

    @GetMapping("get-consumer-name")
    public String getConsumerName(){
        log.info("enter consumer getConsumerName");
        return consumerService.getConsumerName();
    }
}
