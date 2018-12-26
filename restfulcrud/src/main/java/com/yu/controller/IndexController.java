package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/26 20:50.
 */
@Controller
public class IndexController {

    @RequestMapping({"/a","/login.html"})
    public String index(){
        return "login";
    }

}
