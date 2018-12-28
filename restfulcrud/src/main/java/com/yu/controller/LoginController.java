package com.yu.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/28 20:52.
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Map<String,Object> map,
                        HttpSession session){
        if("ys".equals(username) && "123".equals(password)){
            //登录成功
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        }else{
            //登录失败
            map.put("msg","账号或者密码错误");
            return "login";
        }
    }


    @GetMapping("/main")
    public String main(){
        return "dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

}
