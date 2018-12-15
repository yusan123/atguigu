package com.atguigu.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/12/15 20:48.
 */
@Data
@ToString
@Component

public class Dog {

    private String name;
    private String color;
}
