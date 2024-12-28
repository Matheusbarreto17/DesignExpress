package com.wmdigital.designexpress.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
      
        model.addAttribute("title", "Página Iniciale");
        model.addAttribute("message", "Bem-vindo à Minha Aplicação!");
        model.addAttribute("currentDateTime", LocalDateTime.now());
        
        
        
        model.asMap().forEach((key, value) -> System.out.println(key + " -> " + value));

        return "index";
    }
}
