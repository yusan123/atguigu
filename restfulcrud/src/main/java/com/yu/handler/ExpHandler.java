package com.yu.handler;

import com.yu.exception.MyUserNotExistExp;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by Administrator on 2019/1/5 21:48.
 */
@ControllerAdvice
public class ExpHandler {


    @ExceptionHandler(Exception.class)
    public String myExpHander(Exception e, HttpServletRequest request){
        if(e instanceof MyUserNotExistExp){
            MyUserNotExistExp myExp = (MyUserNotExistExp) e;
            HashMap<String, Object> map = new HashMap<>();
            //Integer code = (Integer) request.getAttribute("javax.servlet.error.status_code");

            //request.setAttribute("javax.servlet.error.status_code",Integer.valueOf(myExp.getCode()));
            request.setAttribute("javax.servlet.error.status_code",myExp.getCode());
            map.put("code",myExp.getCode());
            map.put("msg","ext-msgllllllllllllll");
            request.setAttribute("ext",map);
        }

        return "forward:/error";
    }
}
