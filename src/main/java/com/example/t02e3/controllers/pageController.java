package com.example.t02e3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class pageController {
    
    @GetMapping({"/", "/index", "/home"})
    public String showHome(){
        return "indexView";
    }

    @GetMapping("/palmares")
    public String showPalmares() {
        return "palmaresView";
    }

    @GetMapping("/galeria-fotos")
    public String showFotos() {
        return "photogalleryView";
    }     
}
