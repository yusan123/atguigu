package com.yu.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/12/28 22:18.
 */
@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handlerError(HttpServletRequest request){
        String errorCode = request.getAttribute("javax.servlet.error.status_code").toString();
        switch (errorCode){
            case  "404":
                return "404";
            case "500":
                return "500";
            default:
                return "500";
        }
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
