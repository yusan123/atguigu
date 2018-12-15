package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/15 22:08.
 */
@RestController
public class HelloController {

    @Value("${person.dog.name}")
    private String name;

    @GetMapping("/hello")
    public Object hello(){
        return "hello "+ name;
    }
}
