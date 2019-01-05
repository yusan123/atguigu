package com.yu.controller;

import com.yu.exception.MyUserNotExistExp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/5 22:01.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        if("yu".equals(name)){
            throw  new MyUserNotExistExp("用户不存在！！！！！！！！！！",500);
        }
        return "hello:"+name;
    }
}
