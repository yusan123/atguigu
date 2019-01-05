package com.yu.exception;

/**
 * Created by Administrator on 2019/1/5 21:46.
 */
public class MyUserNotExistExp extends RuntimeException {

    private int code;

    public MyUserNotExistExp(String message,int code) {
        super(message);
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
