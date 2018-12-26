package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by Administrator on 2018/12/26 21:47.
 */
@Controller
public class TemplateController {
    @GetMapping("/temp")
    public String temp(Map<String,Object> map){
        map.put("hello","<h1>yyyyyyyyyyyyyyyss</h1>");
        return "ys";
    }
}
