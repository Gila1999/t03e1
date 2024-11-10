package com.example.t02e3.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class pageController {
    
    @GetMapping({"/", "/index", "/home"})
    public String showHome(Model model){
        // Obtenemos el año actual
        int currentYear = LocalDate.now().getYear();
        // Pasar el año al modelo
        model.addAttribute("currentYear", currentYear);
        return "indexView";
    }

    @GetMapping("/palmares")
    public String showPalmares(Model model) {
        // Lista de títulos
        List<String> titles = new ArrayList<>();
        titles.add("Liga 45/46");
        titles.add("Copa 34/35");
        titles.add("Copa 39/40");
        titles.add("Copa 48/49");
        titles.add("Copa 06/07");
        titles.add("Copa 09/10");
        titles.add("Europa Legue 05/06");
        titles.add("Europa Legue 06/07");
        titles.add("Supercopa Europa 06/07");
        titles.add("Supercopa España 07/08");
        titles.add("Europa Legue 13/14");
        titles.add("Europa Legue 14/15");
        titles.add("Europa Legue 13/14");
        titles.add("Europa Legue 19/20");
        titles.add("Europa Legue 22/23");

        //Pasamos la lista de títulos al modelo

        model.addAttribute("titles", titles);
        

        return "palmaresView";
    }

    @GetMapping("/galeria-fotos")
    public String showFotos() {
        return "photogalleryView";
    }     
}
