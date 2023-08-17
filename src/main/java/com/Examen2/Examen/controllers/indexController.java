
package com.Examen2.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//Aqui va el controlador del index.html
@Controller
public class indexController {
    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("Titulo");
        //Se devuelve el nombre del template
        return "index";
    }
}
