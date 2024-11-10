package com.example.configuracion;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @SuppressWarnings("null")
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/enlaces-externos").setViewName("linksView");

    }
    
}
