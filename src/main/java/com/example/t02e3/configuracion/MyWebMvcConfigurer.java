package com.example.t02e3.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    
    @Override
    public void addViewControllers(@NonNull ViewControllerRegistry registry){
        registry.addViewController("/enlaces-externos").setViewName("linksView");

    }
    
}
