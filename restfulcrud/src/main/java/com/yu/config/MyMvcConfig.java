package com.yu.config;

import com.yu.components.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/12/26 22:03.
 */
@Component
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
    }

    //这个方法的名字必须交localeResolver 而且大小写不能错
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
