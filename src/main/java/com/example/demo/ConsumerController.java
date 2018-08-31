package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by xsw on 2018/4/2.
 */

@RestController
public class ConsumerController {

    @RequestMapping(value = "ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return "hello ribbon consumer!";
    }
}
