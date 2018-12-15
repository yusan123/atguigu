package com.atguigu.bean;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/15 20:49.
 */

@ToString
@Component
@ConfigurationProperties(prefix = "person")
@Validated
@Data
//@PropertySource({"classpath:person.properties"})
public class Person {
    @NotNull
    private String name;
    private int age;
    private boolean isOk;
    @Email
    @NotNull
    private String email;
    private Map<String,Object> map;
    private List<Object> list;

    private Dog dog;


}
