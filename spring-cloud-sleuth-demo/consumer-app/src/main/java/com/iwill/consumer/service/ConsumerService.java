package com.iwill.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate ;

    public String getConsumerName(){

        String result =  restTemplate.getForEntity("http://localhost:8070/server/get-name" , String.class).getBody();
  /*      new Thread(){
            @Override
            public void run() {
               String result =  restTemplate.getForEntity("http://localhost:8080/server/get-name" , String.class).getBody();
                System.out.println(result);
            }
        }.start();*/
        return "zhangsan";
    }
}
