package com.example.t02e3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class pageController {
    
    @GetMapping("/")
    public String showHome(){
        return "index";
    }

    @GetMapping("/palmares")
    public String showPalmares() {
        return "palmares";
    }

    @GetMapping("/galeria-fotos")
    public String showFotos() {
        return "galeria-fotos";
    }

    @GetMapping("/enlaces")
    public String showEnlaces() {
        return "enlaces";
    }
}
